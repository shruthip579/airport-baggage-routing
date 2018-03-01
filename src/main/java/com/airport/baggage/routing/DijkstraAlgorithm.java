package com.airport.baggage.routing;

import java.util.List;

import com.airport.baggage.routing.model.DirectedEdge;

/**
 *
 */
public interface DijkstraAlgorithm {
    public String findShortestPath(String entry,String dest, List<DirectedEdge> graphEdges);
}
