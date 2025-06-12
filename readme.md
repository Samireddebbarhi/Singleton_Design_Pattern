# Singleton Design Pattern Demo

## Overview

This project demonstrates the **Singleton Design Pattern**, a creational design pattern that ensures a class has only one instance and provides a global point of access to it.

## What is Singleton?

- Ensures only one instance of a class exists.
- Provides a global access point to that instance.
- Useful for managing shared resources like database connections, configuration settings, or logging.

## Why Use Singleton?

- Controls access to shared resources.
- Saves memory by avoiding multiple instances.
- Maintains consistent state across the application.

## How It Works

- The class constructor is made private or restricted.
- A static method (e.g., `getInstance()`) returns the single instance.
- The instance is created on first use (lazy initialization).


