package com.k2fsa.sherpa.onnx;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import o4.Wz.OGoz;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/k2fsa/sherpa/onnx/QnnConfig;", "", "backendLib", "", "contextBinary", "systemLib", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBackendLib", "()Ljava/lang/String;", "setBackendLib", "(Ljava/lang/String;)V", "getContextBinary", "setContextBinary", "getSystemLib", "setSystemLib", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "sherpa_onnx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class QnnConfig {
    private String backendLib;
    private String contextBinary;
    private String systemLib;

    public QnnConfig() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ QnnConfig copy$default(QnnConfig qnnConfig, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = qnnConfig.backendLib;
        }
        if ((i10 & 2) != 0) {
            str2 = qnnConfig.contextBinary;
        }
        if ((i10 & 4) != 0) {
            str3 = qnnConfig.systemLib;
        }
        return qnnConfig.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBackendLib() {
        return this.backendLib;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContextBinary() {
        return this.contextBinary;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSystemLib() {
        return this.systemLib;
    }

    public final QnnConfig copy(String backendLib, String contextBinary, String systemLib) {
        s.h(backendLib, "backendLib");
        s.h(contextBinary, "contextBinary");
        s.h(systemLib, "systemLib");
        return new QnnConfig(backendLib, contextBinary, systemLib);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QnnConfig)) {
            return false;
        }
        QnnConfig qnnConfig = (QnnConfig) other;
        return s.c(this.backendLib, qnnConfig.backendLib) && s.c(this.contextBinary, qnnConfig.contextBinary) && s.c(this.systemLib, qnnConfig.systemLib);
    }

    public final String getBackendLib() {
        return this.backendLib;
    }

    public final String getContextBinary() {
        return this.contextBinary;
    }

    public final String getSystemLib() {
        return this.systemLib;
    }

    public int hashCode() {
        return (((this.backendLib.hashCode() * 31) + this.contextBinary.hashCode()) * 31) + this.systemLib.hashCode();
    }

    public final void setBackendLib(String str) {
        s.h(str, "<set-?>");
        this.backendLib = str;
    }

    public final void setContextBinary(String str) {
        s.h(str, "<set-?>");
        this.contextBinary = str;
    }

    public final void setSystemLib(String str) {
        s.h(str, "<set-?>");
        this.systemLib = str;
    }

    public String toString() {
        return "QnnConfig(backendLib=" + this.backendLib + ", contextBinary=" + this.contextBinary + ", systemLib=" + this.systemLib + ')';
    }

    public QnnConfig(String backendLib, String contextBinary, String str) {
        s.h(backendLib, "backendLib");
        s.h(contextBinary, "contextBinary");
        s.h(str, OGoz.RPGrusPlYKXUKe);
        this.backendLib = backendLib;
        this.contextBinary = contextBinary;
        this.systemLib = str;
    }

    public /* synthetic */ QnnConfig(String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3);
    }
}
