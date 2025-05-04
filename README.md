# K8_USNG_GITHUBACTION

# Spring Boot Docker Kubernetes Example

This repository demonstrates how to build a Spring Boot application, package it into a Docker container, and deploy it to a Kubernetes cluster using GitHub Actions.

## Project Structure

- `.github/workflows/ci-cd.yml`: GitHub Actions pipeline for building, pushing to Docker Hub, and deploying to Kubernetes.
- `backend/`: Spring Boot application with `Dockerfile` for building the Docker image.
- `k8s/`: Kubernetes deployment and service files.

## Setup

1. Create Docker Hub credentials and store them in GitHub Secrets:
   - `DOCKER_USERNAME`
   - `DOCKER_PASSWORD`
2. Create a Kubernetes `kubeconfig` and store it in GitHub Secrets:
   - `KUBECONFIG`

3. Push changes to the `main` or `develop` branch to trigger the CI/CD pipeline.

## Branch Strategy

We use a Gitflow-inspired branching strategy:

- **main**: Production-ready code, deployable to production.
- **develop**: Development code, integrates features, and runs in staging environments.
- **feature branches**: For individual features or bug fixes, merged into `develop`.

## License

This project is licensed under the MIT License.

