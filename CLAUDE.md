# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Architecture

This is a Kotlin Multiplatform project using Compose Multiplatform targeting Android, iOS, and Desktop (JVM). The project structure follows the standard Compose Multiplatform layout:

- **composeApp/**: Contains the main application code
  - **src/commonMain/**: Shared code across all platforms (UI, business logic)
  - **src/androidMain/**: Android-specific implementations
  - **src/iosMain/**: iOS-specific implementations
  - **src/jvmMain/**: Desktop (JVM) specific implementations
- **iosApp/**: iOS application wrapper with SwiftUI integration
- **gradle/**: Build configuration and dependency management

The application uses Material3 design system and follows Compose patterns with state management via `remember` and `mutableStateOf`.

## Build Commands

### Android
```bash
# Build debug APK
./gradlew :composeApp:assembleDebug

# Install and run on connected device
./gradlew :composeApp:installDebug
```

### Desktop (JVM)
```bash
# Run desktop application
./gradlew :composeApp:run

# Create native distribution packages
./gradlew :composeApp:createDistributable
```

### iOS
Build and run through Xcode by opening the `iosApp/` directory, or use IDE run configurations.

## Testing

```bash
# Run all tests
./gradlew test

# Run specific platform tests
./gradlew :composeApp:testDebugUnitTest    # Android
./gradlew :composeApp:jvmTest              # JVM
```

## Development Notes

- Package namespace: `jp.kaleidot725.paperstack.paperstack`
- Main class for desktop: `jp.kaleidot725.paperstack.paperstack.MainKt`
- Kotlin version: 2.2.10
- Compose Multiplatform version: 1.8.2
- Target JVM version: 11
- Android: Min SDK 24, Target SDK 36

## Project Configuration

- Uses version catalogs (gradle/libs.versions.toml) for dependency management
- Gradle configuration cache and build cache enabled
- Hot reload support enabled for development