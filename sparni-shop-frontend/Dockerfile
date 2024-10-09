# Base image
FROM node:16-alpine as build

# Set the working directory
WORKDIR /app

# Copy the package.json and package-lock.json files
COPY package*.json ./

# Install dependencies
RUN npm install

# Copy the source code
COPY . .

# Build the app
RUN npm run build

# Serve the app using nginx
FROM nginx:alpine
COPY --from=build /app/build /usr/share/nginx/html

# Expose the port nginx will serve on
EXPOSE 80

# Start nginx
CMD ["nginx", "-g", "daemon off;"]
