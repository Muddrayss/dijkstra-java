# Graph Shortest Path Algorithm

This repository contains Java code for a graph representation and a shortest path algorithm based on the principles of Dijkstra's algorithm.

## Table of Contents
- [Graph Shortest Path Algorithm](#graph-shortest-path-algorithm)
  - [Table of Contents](#table-of-contents)
  - [Overview](#overview)
  - [Usage](#usage)
  - [Abstracted Rules](#abstracted-rules)
  - [Features](#features)
  - [Contribution](#contribution)
  - [A Special Note from Muddrays (Ennio Gualandi) 🚀](#a-special-note-from-muddrays-ennio-gualandi-)

## Overview

The main classes include:
- `Node`: Represents individual nodes or vertices in the graph. Contains attributes like `name`, `distance`, `shortestPath`, and `adjacentNodes`.
- `GraphEnnio`: Represents the entire graph. Contains methods to calculate the shortest path and display the nodes in a stylized format.

## Usage

1. **Initialization**
   
   Create nodes and add them to the graph.
   ```java
   Node nodeA = new Node("A");
   GraphEnnio graph = new GraphEnnio();
   graph.addNode(nodeA);
   ```

2. **Add Destinations**

   Define connections and their weights between nodes.
   ```java
   Node nodeB = new Node("B");
   nodeA.addDestination(nodeB, 10);
   ```

3. **Calculate Shortest Path**

   Calculate the shortest path from a source node to all other nodes in the graph.
   ```java
   graph.calculateShortestPath(nodeA);
   ```

4. **Display Nodes**

   Print the nodes in a stylized ASCII format.
   ```java
   graph.printFoundNodes();
   ```

## Abstracted Rules

The underlying logic for the shortest path algorithm is based on the following rules:

1. Every time we set out to visit a new node, we choose the node with the smallest known distance/cost to visit first.
2. Once we’ve moved to the node we’re going to visit, we check each of its neighboring nodes.
3. For each neighboring node, we calculate the distance/cost for the neighboring nodes by summing the cost of the edges that lead to the node we’re checking from the starting vertex.
4. If the distance/cost to a node is less than a known distance, we update the shortest distance on file for that vertex.

## Features

- Efficient representation of a graph using a set of nodes.
- Dijkstra-inspired algorithm to determine the shortest path.
- Stylized console output for better visualization of nodes.

## Contribution

Contributions to enhance the functionalities or improve the code quality are welcome. Please fork this repository and create a pull request. Ensure your code adheres to Java best practices.

---

Remember, this is just a basic README. Depending on the actual complexity and requirements of the project, you might want to expand on sections, add installation instructions, dependencies, screenshots, etc.

Certainly! Here's an addition to the `README.md` with a cool thank-you message from Muddrays (Ennio Gualandi):

---

## A Special Note from Muddrays (Ennio Gualandi) 🚀

🌌 To the vast and vibrant cosmos of coders, thinkers, and dreamers who've journeyed through this codebase:

🎸 I want to drop a massive "Thank You!" riff that reverberates through the digital ether. Your insights, contributions, or mere presence in this space has made all the difference.

🎉 Here's to the never-ending adventure of coding and the camaraderie of this incredible community. Let's keep making the virtual world a playground of possibilities. Rock on! 🤘

---

Stay rad and code on,
Muddrays

---