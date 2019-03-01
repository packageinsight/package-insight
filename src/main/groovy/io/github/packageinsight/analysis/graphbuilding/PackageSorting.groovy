package io.github.packageinsight.analysis.graphbuilding

import io.github.packageinsight.analysis.PackageName

class PackageSorting {

    final static Comparator<PackageName> byName = Comparator.comparing({ PackageName packageName -> packageName.name })
}
