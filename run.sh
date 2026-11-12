#!/usr/bin/env bash
set -euo pipefail

cd "$(dirname "$0")"

if ! podman info &>/dev/null; then
  echo "Starting Podman machine..."
  podman machine start
fi

podman build -t hello-world .
podman rm -f hello-world 2>/dev/null || true
podman run --rm -d -p 8080:80 --name hello-world hello-world

echo "Hello World is running at http://localhost:8080"
curl -sS http://127.0.0.1:8080
echo
