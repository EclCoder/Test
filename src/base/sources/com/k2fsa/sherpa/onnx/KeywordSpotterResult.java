package com.k2fsa.sherpa.onnx;

import gl.j;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J2\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\b\u0010\u001a\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/k2fsa/sherpa/onnx/KeywordSpotterResult;", "", "keyword", "", "tokens", "", "timestamps", "", "(Ljava/lang/String;[Ljava/lang/String;[F)V", "getKeyword", "()Ljava/lang/String;", "getTimestamps", "()[F", "getTokens", "()[Ljava/lang/String;", "[Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;[Ljava/lang/String;[F)Lcom/k2fsa/sherpa/onnx/KeywordSpotterResult;", "equals", "", "other", "hashCode", "", "toString", "sherpa_onnx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class KeywordSpotterResult {
    private final String keyword;
    private final float[] timestamps;
    private final String[] tokens;

    public KeywordSpotterResult(String keyword, String[] tokens, float[] timestamps) {
        s.h(keyword, "keyword");
        s.h(tokens, "tokens");
        s.h(timestamps, "timestamps");
        this.keyword = keyword;
        this.tokens = tokens;
        this.timestamps = timestamps;
    }

    public static /* synthetic */ KeywordSpotterResult copy$default(KeywordSpotterResult keywordSpotterResult, String str, String[] strArr, float[] fArr, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = keywordSpotterResult.keyword;
        }
        if ((i10 & 2) != 0) {
            strArr = keywordSpotterResult.tokens;
        }
        if ((i10 & 4) != 0) {
            fArr = keywordSpotterResult.timestamps;
        }
        return keywordSpotterResult.copy(str, strArr, fArr);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKeyword() {
        return this.keyword;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String[] getTokens() {
        return this.tokens;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float[] getTimestamps() {
        return this.timestamps;
    }

    public final KeywordSpotterResult copy(String keyword, String[] tokens, float[] timestamps) {
        s.h(keyword, "keyword");
        s.h(tokens, "tokens");
        s.h(timestamps, "timestamps");
        return new KeywordSpotterResult(keyword, tokens, timestamps);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KeywordSpotterResult)) {
            return false;
        }
        KeywordSpotterResult keywordSpotterResult = (KeywordSpotterResult) other;
        return s.c(this.keyword, keywordSpotterResult.keyword) && s.c(this.tokens, keywordSpotterResult.tokens) && s.c(this.timestamps, keywordSpotterResult.timestamps);
    }

    public final String getKeyword() {
        return this.keyword;
    }

    public final float[] getTimestamps() {
        return this.timestamps;
    }

    public final String[] getTokens() {
        return this.tokens;
    }

    public int hashCode() {
        return (((this.keyword.hashCode() * 31) + Arrays.hashCode(this.tokens)) * 31) + Arrays.hashCode(this.timestamps);
    }

    public String toString() {
        return "Keyword: " + this.keyword + "\nTokens: [" + j.m0(this.tokens, ", ", null, null, 0, null, null, 62, null) + "]\nTimestamps: [" + j.l0(this.timestamps, ", ", null, null, 0, null, KeywordSpotterResult$toString$timestampsStr$1.INSTANCE, 30, null) + ']';
    }
}
