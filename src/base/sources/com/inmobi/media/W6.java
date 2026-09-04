package com.inmobi.media;

import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class W6 extends Hi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25926a;

    public W6(String fileName) {
        kotlin.jvm.internal.s.h(fileName, "fileName");
        kotlin.jvm.internal.s.h("application/json", "contentType");
        this.f25926a = fileName;
    }

    @Override // com.inmobi.media.Hi
    public final void a(xn.f bufferedSink) throws IOException {
        kotlin.jvm.internal.s.h(bufferedSink, "bufferedSink");
        String filePath = this.f25926a;
        kotlin.jvm.internal.s.h(filePath, "filePath");
        xn.e eVar = new xn.e();
        FileInputStream fileInputStream = new FileInputStream(filePath);
        try {
            eVar.T0(fileInputStream);
            ql.b.a(fileInputStream, null);
            try {
                try {
                    try {
                        bufferedSink.C0(eVar);
                        kotlin.jvm.internal.s.h(eVar, "<this>");
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            ql.b.a(eVar, th2);
                            throw th3;
                        }
                    }
                } catch (IOException e10) {
                    throw e10;
                } catch (Exception unused) {
                    fl.g0 g0Var = fl.g0.f38750a;
                    kotlin.jvm.internal.s.h(eVar, "<this>");
                }
                try {
                    eVar.close();
                } catch (IOException unused2) {
                }
                ql.b.a(eVar, null);
            } catch (Throwable th4) {
                kotlin.jvm.internal.s.h(eVar, "<this>");
                try {
                    eVar.close();
                } catch (IOException unused3) {
                }
                throw th4;
            }
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                ql.b.a(fileInputStream, th5);
                throw th6;
            }
        }
    }

    @Override // com.inmobi.media.Hi
    public final String a() {
        return "application/json";
    }
}
