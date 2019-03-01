package io.github.packageinsight.analysis.graphbuilding

import io.github.packageinsight.analysis.PackageName
import io.github.packageinsight.analysis.graph.Edge

class Helpers {

    static def edge(PackageName from, PackageName to) {
        new Edge(from, to)
    }

    static def edge(String e) {
        def split = e.split(/->/)
        assert split.length == 2
        edge(p(split[0]), p(split[1]))
    }

    static PackageName p(String packageName) {
        new PackageName(packageName)
    }
}
