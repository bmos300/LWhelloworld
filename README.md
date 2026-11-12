# Hello World

Simple nginx web server run with Podman.

## Run

```bash
podman build -t hello-world .
podman run --rm -d -p 8080:80 --name hello-world hello-world
```

Open http://localhost:8080

## Stop

```bash
podman stop hello-world
```
