package com.google.android.gms.common.server.response;

import java.io.BufferedReader;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class zae implements zai {
    zae() {
    }

    @Override // com.google.android.gms.common.server.response.zai
    public final /* bridge */ /* synthetic */ Object zaa(FastParser fastParser, BufferedReader bufferedReader) {
        return Boolean.valueOf(fastParser.zay(bufferedReader, false));
    }
}
