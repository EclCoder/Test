package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class z0 {
    private static final x0 FULL_SCHEMA = loadSchemaForFullRuntime();
    private static final x0 LITE_SCHEMA = new y0();

    z0() {
    }

    static x0 full() {
        return FULL_SCHEMA;
    }

    static x0 lite() {
        return LITE_SCHEMA;
    }

    private static x0 loadSchemaForFullRuntime() {
        try {
            return (x0) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
