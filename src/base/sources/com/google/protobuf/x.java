package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
class x implements r0 {
    private static final x instance = new x();

    private x() {
    }

    public static x getInstance() {
        return instance;
    }

    @Override // com.google.protobuf.r0
    public boolean isSupported(Class<?> cls) {
        return y.class.isAssignableFrom(cls);
    }

    @Override // com.google.protobuf.r0
    public q0 messageInfoFor(Class<?> cls) {
        if (!y.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (q0) y.getDefaultInstance(cls.asSubclass(y.class)).buildMessageInfo();
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e10);
        }
    }
}
