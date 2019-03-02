package io.github.packageinsight.analysis.code

import groovy.transform.EqualsAndHashCode
import groovy.transform.Immutable

@Immutable
@EqualsAndHashCode
class ImportLine {
    PackageName packageName
    String originalImport
    int lineNo

    static ImportLine fromLine(int lineNo, String line) {
        def importPackage = extractFromLine(line)
        if (importPackage == null) return null
        new ImportLine(
                packageName: new PackageName(name: importPackage),
                lineNo: lineNo,
                originalImport: line
        )
    }

    static String extractFromLine(String s) {
        // https://regex101.com/r/Nj45v9/2
        def group = (s =~ /^\s*(import)\s*(static)?\s*([a-z0-9.]*)\./)
        if (group.size() == 1) {
            return group[0][3]
        }
        return null
    }
}
