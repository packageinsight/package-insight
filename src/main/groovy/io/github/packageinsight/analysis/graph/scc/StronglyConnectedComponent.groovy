package io.github.packageinsight.analysis.graph.scc

import groovy.transform.EqualsAndHashCode
import groovy.transform.Immutable
import io.github.packageinsight.analysis.graph.Edge

@Immutable
@EqualsAndHashCode
class StronglyConnectedComponent<T> {
    Set<T> nodes
    Set<Edge<T>> edges

    def size() {
        nodes.size()
    }

    @Override
    String toString() {
        edges.toString()
    }
}
