package com.bytedance.sdk.component.hn.hnj;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class sk extends orl {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    List<String> f12883hn;
    List<String> hnj;

    sk(List<String> list, List<String> list2) {
        this.hnj = list;
        this.f12883hn = list2;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class hnj {
        private final List<String> hnj = new ArrayList();

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private final List<String> f12884hn = new ArrayList();

        public hnj hnj(String str, String str2) {
            this.hnj.add(str);
            this.f12884hn.add(str2);
            return this;
        }

        public sk hnj() {
            return new sk(this.hnj, this.f12884hn);
        }
    }
}
