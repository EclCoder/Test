package com.bytedance.sdk.component.sk.hn.qor.hnj.hnj;

import com.bytedance.sdk.component.sk.qor;
import com.bytedance.sdk.component.utils.ta;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn implements qor {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private hnj f12964hn;
    private int hnj;

    public hn(File file, long j10) {
        int i10 = (int) j10;
        this.hnj = i10;
        this.f12964hn = hnj.hnj(i10, file);
    }

    @Override // com.bytedance.sdk.component.sk.hnj
    /* JADX INFO: renamed from: qor, reason: merged with bridge method [inline-methods] */
    public boolean hn(String str) {
        try {
            InputStream inputStreamHnj = this.f12964hn.hnj(str);
            boolean z10 = inputStreamHnj != null;
            ta.hnj(inputStreamHnj);
            return z10;
        } catch (Throwable th2) {
            try {
                th2.getMessage();
                return false;
            } finally {
                ta.hnj(null);
            }
        }
    }

    @Override // com.bytedance.sdk.component.sk.hnj
    /* JADX INFO: renamed from: hn, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public byte[] hnj(String str) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th2;
        InputStream inputStreamHnj;
        hnj hnjVar = this.f12964hn;
        if (hnjVar != null && str != null) {
            try {
                inputStreamHnj = hnjVar.hnj(str);
                if (inputStreamHnj != null) {
                    try {
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            byte[] bArr = new byte[UserVerificationMethods.USER_VERIFY_ALL];
                            while (true) {
                                int i10 = inputStreamHnj.read(bArr);
                                if (i10 == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, i10);
                            }
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            th2 = th3;
                            ta.hnj(inputStreamHnj);
                            ta.hnj(byteArrayOutputStream);
                            throw th2;
                        }
                    } catch (IOException unused2) {
                        byteArrayOutputStream = null;
                    } catch (Throwable th4) {
                        th2 = th4;
                        byteArrayOutputStream = null;
                        ta.hnj(inputStreamHnj);
                        ta.hnj(byteArrayOutputStream);
                        throw th2;
                    }
                } else {
                    byteArrayOutputStream = null;
                }
                if (byteArrayOutputStream != null) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    ta.hnj(inputStreamHnj);
                    ta.hnj(byteArrayOutputStream);
                    return byteArray;
                }
            } catch (IOException unused3) {
                inputStreamHnj = null;
                byteArrayOutputStream = null;
            } catch (Throwable th5) {
                byteArrayOutputStream = null;
                th2 = th5;
                inputStreamHnj = null;
            }
            ta.hnj(inputStreamHnj);
            ta.hnj(byteArrayOutputStream);
        }
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.sdk.component.sk.qor
    public InputStream hnj(String str) {
        hnj hnjVar = this.f12964hn;
        if (hnjVar == null) {
            return null;
        }
        return hnjVar.hnj(str);
    }

    @Override // com.bytedance.sdk.component.sk.hnj
    public boolean hnj(String str, byte[] bArr) {
        hnj hnjVar = this.f12964hn;
        if (hnjVar == null || bArr == null || str == null) {
            return false;
        }
        return hnjVar.hnj(str, bArr);
    }
}
