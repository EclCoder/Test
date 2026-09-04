package com.bumptech.glide.load.engine;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class b extends RuntimeException {
    private static final long serialVersionUID = -7530898992688511851L;

    b(Throwable th2) {
        super("Unexpected exception thrown by non-Glide code", th2);
    }
}
