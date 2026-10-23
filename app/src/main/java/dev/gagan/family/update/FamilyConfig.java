package dev.gagan.family.update;

/**
 * Family build configuration, owned by the vendored updater rather than the host app's BuildConfig:
 * the fork then needs no build.gradle edit for its update channel, and a broken sync cannot silently
 * point the app at someone else's server.
 */
public final class FamilyConfig {
    public static final String MANIFEST_URL =
            "https://mumbai-vps-1.tail376c5b.ts.net:8443/com.bitchat.droid/manifest";
    public static final String SIGNER_SHA256 = "17f9de01f682d947b8837d697cd62743e47859f5cfbe2c236cdd40d1c2f87819";

    private FamilyConfig() {
    }
}
