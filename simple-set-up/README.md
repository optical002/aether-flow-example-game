# Multiproject setup with Editor and Engine

## Versions
- Engine 0.0.5
- Editor 0.0.2

## Running Editor

Run `Editor` object. Right now it's only simple performance window with scalafx.

## Build .exe

To build run commands in powershell
```
iwr -useb https://github.com/optical002/aether-flow-tooling/releases/download/build-tools-v0.1.0/install.ps1 | iex
```
```
./build.ps1 -p game
```

Build will be placed inside `./build_artifacts/%build_number%/...`