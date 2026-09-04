package com.squareup.picasso;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public interface Cache {
    public static final Cache NONE = new Cache() { // from class: com.squareup.picasso.Cache.1
        @Override // com.squareup.picasso.Cache
        public Bitmap get(String str) {
            return null;
        }

        @Override // com.squareup.picasso.Cache
        public int maxSize() {
            return 0;
        }

        @Override // com.squareup.picasso.Cache
        public int size() {
            return 0;
        }

        @Override // com.squareup.picasso.Cache
        public void clear() {
        }

        @Override // com.squareup.picasso.Cache
        public void clearKeyUri(String str) {
        }

        @Override // com.squareup.picasso.Cache
        public void set(String str, Bitmap bitmap) {
        }
    };

    void clear();

    void clearKeyUri(String str);

    Bitmap get(String str);

    int maxSize();

    void set(String str, Bitmap bitmap);

    int size();
}
