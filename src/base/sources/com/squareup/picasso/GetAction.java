package com.squareup.picasso;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
class GetAction extends Action<Void> {
    GetAction(Picasso picasso, Request request, int i10, int i11, Object obj, String str) {
        super(picasso, null, request, i10, i11, 0, null, str, obj, false);
    }

    @Override // com.squareup.picasso.Action
    public void error(Exception exc) {
    }

    @Override // com.squareup.picasso.Action
    void complete(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
    }
}
