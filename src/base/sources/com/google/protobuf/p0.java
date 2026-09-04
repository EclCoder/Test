package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class p0 {
    private static final n0 FULL_SCHEMA = loadSchemaForFullRuntime();
    private static final n0 LITE_SCHEMA = new o0();

    p0() {
    }

    static n0 full() {
        return FULL_SCHEMA;
    }

    static n0 lite() {
        return LITE_SCHEMA;
    }

    private static n0 loadSchemaForFullRuntime() {
        try {
            return (n0) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
