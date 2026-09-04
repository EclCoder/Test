package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
abstract class s extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final LinkedHashSet f20013a = new LinkedHashSet();

    s() {
    }

    boolean q(r rVar) {
        return this.f20013a.add(rVar);
    }

    void s() {
        this.f20013a.clear();
    }
}
