group = "xyz.elouan.godot.patches"

patches {
    about {
        name = "Godot Morphe Patches"
        description = "Generic Morphe patches for Godot Android games, tested with Sobosuba."
        source = "https://github.com/elouangrimm/godot-morphe-patches"
        author = "Elouan Grimme"
        contact = "https://github.com/elouangrimm"
        website = "https://github.com/elouangrimm/godot-morphe-patches"
        license = "GPLv3"
    }
}

// Separate configuration so gson is available at runtime for the
// generatePatchesList task but never bundled into the APK.
val patchListGeneratorClasspath = configurations.create("patchListGeneratorClasspath")

dependencies {
    compileOnly(libs.gson)
    patchListGeneratorClasspath(libs.gson)
}

tasks {
    register<JavaExec>("generatePatchesList") {
        description = "Build patch with patch list"

        dependsOn(build)

        classpath = sourceSets["main"].runtimeClasspath + patchListGeneratorClasspath
        mainClass.set("util.PatchListGeneratorKt")
    }

    // Used by gradle-semantic-release-plugin.
    publish {
        dependsOn("generatePatchesList")
    }
}
