# =================================
# Frontend Dockerfile (Angular App)
# =================================

# Stage 1: Build Angular app
FROM node:20-alpine AS build

WORKDIR /usr/src/app

# Copy package manifests first for caching
COPY package*.json ./
RUN npm ci

# Copy the rest of the source and build
COPY . .
RUN npm run build -- --configuration production

# Stage 2: Serve with NGINX
FROM nginx:stable-alpine

# Remove default nginx site
RUN rm -rf /usr/share/nginx/html/*

# Copy compiled Angular dist output
COPY --from=build /usr/src/app/dist/ /usr/share/nginx/html

# Copy custom nginx config (optional, can add later for SPA routing)
# COPY nginx.conf /etc/nginx/conf.d/default.conf

EXPOSE 80

CMD ["nginx", "-g", "daemon off;"]
