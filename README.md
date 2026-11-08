# Godot Morphe Patches

Generic Morphe patches for Godot Android games, tested with Sobosuba
(`com.keepeetron.sobosuba`).

## ❓ About

These patches enable debug mode for mod installation and optionally clone a
Godot game so the patched copy can be installed alongside the original.

### How to use these patches

Click the button below, or manually add this repo url to Morphe Manager:
https://github.com/elouangrimm/godot-morphe-patches

<a href="https://morphe.software/add-source?github=elouangrimm/godot-morphe-patches">
  <img src=".github/assets/add-to-morphe.svg" alt="Add to Morphe" height="48">
</a>

## 🩹 Patches list

<!-- PATCHES_START EXPANDED -->
> **Development build**&nbsp;&nbsp;•&nbsp;&nbsp;`godot-rebrand`&nbsp;&nbsp;•&nbsp;&nbsp;2 patches total
<details open>
<summary>📦 Godot Android games&nbsp;&nbsp;•&nbsp;&nbsp;2 patches</summary>
<br>

**Tested package:** `com.keepeetron.sobosuba`

| 💊&nbsp;Patch | 📜&nbsp;Description | ⚙️&nbsp;Options |
|----------|----------------|-----------|
| [Clone app](#clone-app) | Changes the app package name to allow installing the same app multiple times. By default ".morphe" is appended to the package name. Each cloned install must use a unique package name. Cloning does not work with all apps and using this patch may cause app crashes or other unexpected behavior. | • Package name<br>• Update permissions<br>• Update providers |
| [Enable debug mode](#enable-debug-mode) | Makes the app debuggable, allowing mod installation via Shizuku without root. |  |

</details>

<!-- PATCHES_END -->

### 🛠️ Building locally

- Run `./gradlew buildAndroid`
- The built patches .mpp file is found in `patches/build/libs/patches-*.mpp`
- Patch the mpp file using [Morphe-Desktop](https://github.com/MorpheApp/morphe-desktop)
  like any other patch bundle.

See the [Morphe documentation](https://github.com/MorpheApp/morphe-documentation) for more information.

## 📜 License

Godot Morphe Patches are licensed under the [GNU General Public License v3.0](LICENSE)
