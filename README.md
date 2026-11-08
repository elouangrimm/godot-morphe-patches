# Sobosuba Morphe Patches

Morphe patches for the Sobosuba Android game (`com.keepeetron.sobosuba`).

## ❓ About

These patches enable debug mode for mod installation and optionally clone the
game so the patched copy can be installed alongside the original.

### How to use these patches

Click the button below, or manually add this repo url to Morphe Manager:
https://github.com/elouangrimm/sobosuba-morphe-patches

<a href="https://morphe.software/add-source?github=elouangrimm/sobosuba-morphe-patches">
  <img src=".github/assets/add-to-morphe.svg" alt="Add to Morphe" height="48">
</a>

## 🩹 Patches list

<!-- PATCHES_START EXPANDED -->
> **[v1.0.0](https://github.com/elouangrimm/sobosuba-morphe-patches/releases/tag/v1.0.0)**&nbsp;&nbsp;•&nbsp;&nbsp;`main`&nbsp;&nbsp;•&nbsp;&nbsp;2 patches total
<details open>
<summary>📦 Sobosuba&nbsp;&nbsp;•&nbsp;&nbsp;2 patches</summary>
<br>

**Package name:** `com.keepeetron.sobosuba`

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

Sobosuba Morphe Patches are licensed under the [GNU General Public License v3.0](LICENSE)
