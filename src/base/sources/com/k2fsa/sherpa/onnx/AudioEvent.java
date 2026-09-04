package com.k2fsa.sherpa.onnx;

import kotlin.Metadata;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/k2fsa/sherpa/onnx/AudioEvent;", "", "name", "", "index", "", "prob", "", "(Ljava/lang/String;IF)V", "getIndex", "()I", "getName", "()Ljava/lang/String;", "getProb", "()F", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "sherpa_onnx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class AudioEvent {
    private final int index;
    private final String name;
    private final float prob;

    public AudioEvent(String name, int i10, float f10) {
        s.h(name, "name");
        this.name = name;
        this.index = i10;
        this.prob = f10;
    }

    public static /* synthetic */ AudioEvent copy$default(AudioEvent audioEvent, String str, int i10, float f10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = audioEvent.name;
        }
        if ((i11 & 2) != 0) {
            i10 = audioEvent.index;
        }
        if ((i11 & 4) != 0) {
            f10 = audioEvent.prob;
        }
        return audioEvent.copy(str, i10, f10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getProb() {
        return this.prob;
    }

    public final AudioEvent copy(String name, int index, float prob) {
        s.h(name, "name");
        return new AudioEvent(name, index, prob);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AudioEvent)) {
            return false;
        }
        AudioEvent audioEvent = (AudioEvent) other;
        return s.c(this.name, audioEvent.name) && this.index == audioEvent.index && Float.compare(this.prob, audioEvent.prob) == 0;
    }

    public final int getIndex() {
        return this.index;
    }

    public final String getName() {
        return this.name;
    }

    public final float getProb() {
        return this.prob;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + Integer.hashCode(this.index)) * 31) + Float.hashCode(this.prob);
    }

    public String toString() {
        return "AudioEvent(name=" + this.name + ", index=" + this.index + ", prob=" + this.prob + ')';
    }
}
