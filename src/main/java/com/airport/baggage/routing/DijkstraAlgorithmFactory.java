package com.airport.baggage.routing;

/**
 *
 */
public class DijkstraAlgorithmFactory {

    public static DijkstraAlgorithm createDijkstraAlgorithm(){
        return new DijkstraAlgorithmImpl();
    }
}
