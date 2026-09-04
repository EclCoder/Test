package com.mbridge.msdk.thrid.okhttp.internal.http2;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public interface l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f33422a = new a();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a implements l {
        a() {
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.l
        public void a(int i10, b bVar) {
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.l
        public boolean a(int i10, List<c> list) {
            return true;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.l
        public boolean a(int i10, List<c> list, boolean z10) {
            return true;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.l
        public boolean a(int i10, com.mbridge.msdk.thrid.okio.e eVar, int i11, boolean z10) {
            eVar.skip(i11);
            return true;
        }
    }

    void a(int i10, b bVar);

    boolean a(int i10, com.mbridge.msdk.thrid.okio.e eVar, int i11, boolean z10);

    boolean a(int i10, List<c> list);

    boolean a(int i10, List<c> list, boolean z10);
}
