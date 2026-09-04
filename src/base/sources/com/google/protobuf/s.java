package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class s {
    private static final q LITE_SCHEMA = new r();
    private static final q FULL_SCHEMA = loadSchemaForFullRuntime();

    s() {
    }

    static q full() {
        q qVar = FULL_SCHEMA;
        if (qVar != null) {
            return qVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static q lite() {
        return LITE_SCHEMA;
    }

    private static q loadSchemaForFullRuntime() {
        try {
            return (q) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
