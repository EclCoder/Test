package com.hecorat.screenrecorder.free.videoeditor;

import kotlin.jvm.internal.s;
import nf.w;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f23442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f23443b;

    public j(w preset, boolean z10) {
        s.h(preset, "preset");
        this.f23442a = preset;
        this.f23443b = z10;
    }

    public final w a() {
        return this.f23442a;
    }

    public final boolean b() {
        return this.f23443b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f23442a == jVar.f23442a && this.f23443b == jVar.f23443b;
    }

    public int hashCode() {
        return (this.f23442a.hashCode() * 31) + Boolean.hashCode(this.f23443b);
    }

    public String toString() {
        return "PresetRow(preset=" + this.f23442a + ", selected=" + this.f23443b + ')';
    }
}
