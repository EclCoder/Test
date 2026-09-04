package com.mbridge.msdk.foundation.download.download;

import android.webkit.URLUtil;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.net.MBridgeHostnameVerifier;
import com.mbridge.msdk.foundation.same.task.a;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.q0;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class DownLoadUtils {
    private static final int DOWNLOAD_CONNECTION_TIME_OUT = 20000;
    private static final int DOWNLOAD_READ_TIME_OUT = 30000;
    public static final String END_TAG = "<mbridgeloadend></mbridgeloadend>";
    private static final String TAG = "DownLoadUtils";

    public static void getSourceCodeFromNetUrl(final String str, final H5DownLoadManager.IOnDownLoadH5Source iOnDownLoadH5Source, final boolean z10) {
        try {
            if (!a1.a(str) && URLUtil.isNetworkUrl(str)) {
                DownloadTask.getInstance().runTask(new a() { // from class: com.mbridge.msdk.foundation.download.download.DownLoadUtils.1
                    /* JADX WARN: Code duplicated, block: B:103:0x016f A[DONT_INVERT] */
                    /* JADX WARN: Code duplicated, block: B:104:0x0171 A[Catch: Exception -> 0x016d, TRY_LEAVE, TryCatch #3 {Exception -> 0x016d, blocks: (B:100:0x0169, B:104:0x0171), top: B:112:0x0169 }] */
                    /* JADX WARN: Code duplicated, block: B:112:0x0169 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:116:0x00ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:119:0x0102 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:61:0x00f3 A[DONT_INVERT] */
                    /* JADX WARN: Code duplicated, block: B:62:0x00f5 A[Catch: Exception -> 0x00f1, TRY_LEAVE, TryCatch #8 {Exception -> 0x00f1, blocks: (B:58:0x00ed, B:62:0x00f5), top: B:116:0x00ed }] */
                    /* JADX WARN: Code duplicated, block: B:74:0x0115  */
                    /* JADX WARN: Code duplicated, block: B:75:0x0117 A[Catch: all -> 0x0113, TryCatch #10 {all -> 0x0113, blocks: (B:66:0x0102, B:69:0x0108, B:71:0x010b, B:75:0x0117, B:77:0x011d, B:79:0x0123, B:81:0x012b, B:83:0x012f, B:84:0x0135, B:86:0x0139), top: B:119:0x0102 }] */
                    /* JADX WARN: Code duplicated, block: B:84:0x0135 A[Catch: all -> 0x0113, TryCatch #10 {all -> 0x0113, blocks: (B:66:0x0102, B:69:0x0108, B:71:0x010b, B:75:0x0117, B:77:0x011d, B:79:0x0123, B:81:0x012b, B:83:0x012f, B:84:0x0135, B:86:0x0139), top: B:119:0x0102 }] */
                    /* JADX WARN: Code duplicated, block: B:86:0x0139 A[Catch: all -> 0x0113, TRY_LEAVE, TryCatch #10 {all -> 0x0113, blocks: (B:66:0x0102, B:69:0x0108, B:71:0x010b, B:75:0x0117, B:77:0x011d, B:79:0x0123, B:81:0x012b, B:83:0x012f, B:84:0x0135, B:86:0x0139), top: B:119:0x0102 }] */
                    /* JADX WARN: Instruction removed from duplicated block: B:86:0x0139, please report this as an issue */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v18, types: [com.mbridge.msdk.foundation.download.download.H5DownLoadManager$IOnDownLoadH5Source] */
                    /* JADX WARN: Type inference failed for: r6v0 */
                    /* JADX WARN: Type inference failed for: r6v1 */
                    /* JADX WARN: Type inference failed for: r6v10, types: [java.io.ByteArrayOutputStream] */
                    /* JADX WARN: Type inference failed for: r6v11 */
                    /* JADX WARN: Type inference failed for: r6v12, types: [java.io.ByteArrayOutputStream] */
                    /* JADX WARN: Type inference failed for: r6v13 */
                    /* JADX WARN: Type inference failed for: r6v14 */
                    /* JADX WARN: Type inference failed for: r6v15 */
                    /* JADX WARN: Type inference failed for: r6v16 */
                    /* JADX WARN: Type inference failed for: r6v2, types: [java.io.ByteArrayOutputStream] */
                    /* JADX WARN: Type inference failed for: r6v3 */
                    /* JADX WARN: Type inference failed for: r6v4 */
                    /* JADX WARN: Type inference failed for: r6v5 */
                    /* JADX WARN: Type inference failed for: r6v6, types: [java.io.ByteArrayOutputStream] */
                    /* JADX WARN: Type inference failed for: r6v9 */
                    /* JADX WARN: Type inference failed for: r7v0 */
                    /* JADX WARN: Type inference failed for: r7v1 */
                    /* JADX WARN: Type inference failed for: r7v13 */
                    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.String] */
                    /* JADX WARN: Type inference failed for: r7v3 */
                    /* JADX WARN: Type inference failed for: r7v4 */
                    /* JADX WARN: Type inference failed for: r7v5 */
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // com.mbridge.msdk.foundation.same.task.a
                    public void runTask() throws Throwable {
                        ?? r10;
                        InputStream inputStream;
                        byte[] byteArray;
                        ?? byteArrayOutputStream;
                        ?? r11;
                        ?? r12;
                        String message;
                        H5DownLoadManager.IOnDownLoadH5Source iOnDownLoadH5Source2;
                        boolean z11;
                        String str2;
                        InputStream inputStream2 = null;
                        boolean z12 = false;
                        try {
                            H5DownLoadManager.IOnDownLoadH5Source iOnDownLoadH5Source3 = iOnDownLoadH5Source;
                            if (iOnDownLoadH5Source3 != null) {
                                iOnDownLoadH5Source3.onStart();
                            }
                            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(str).openConnection();
                            httpsURLConnection.setHostnameVerifier(new MBridgeHostnameVerifier(str));
                            httpsURLConnection.setReadTimeout(DownLoadUtils.DOWNLOAD_READ_TIME_OUT);
                            httpsURLConnection.setConnectTimeout(20000);
                            int responseCode = httpsURLConnection.getResponseCode();
                            q0.a(DownLoadUtils.TAG, "response code " + responseCode);
                            try {
                                try {
                                    if (responseCode == 200) {
                                        inputStream = httpsURLConnection.getInputStream();
                                        try {
                                            byte[] bArr = new byte[6144];
                                            byteArrayOutputStream = new ByteArrayOutputStream();
                                            while (true) {
                                                try {
                                                    try {
                                                        int i10 = inputStream.read(bArr);
                                                        if (i10 == -1) {
                                                            break;
                                                        } else {
                                                            byteArrayOutputStream.write(bArr, 0, i10);
                                                        }
                                                    } catch (Exception e10) {
                                                        e = e10;
                                                        byteArray = null;
                                                    }
                                                    if (z12) {
                                                        try {
                                                            if (!z10 && byteArray != null && byteArray.length > 0) {
                                                                iOnDownLoadH5Source.onSuccess(null, byteArray, str);
                                                            } else if (z12 || !a1.b(r11) || r11.length() <= 0 || !r11.contains(DownLoadUtils.END_TAG)) {
                                                                iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                                                                if (iOnDownLoadH5Source2 != null) {
                                                                    iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                                                                }
                                                            } else {
                                                                ?? r13 = iOnDownLoadH5Source;
                                                                if (r13 != 0) {
                                                                    r13.onSuccess(r11, byteArray, str);
                                                                }
                                                            }
                                                        } catch (Throwable th2) {
                                                            if (MBridgeConstans.DEBUG) {
                                                                th2.printStackTrace();
                                                            }
                                                            H5DownLoadManager.IOnDownLoadH5Source iOnDownLoadH5Source4 = iOnDownLoadH5Source;
                                                            if (iOnDownLoadH5Source4 != null) {
                                                                try {
                                                                    iOnDownLoadH5Source4.onFailed(th2.getMessage());
                                                                    return;
                                                                } catch (Exception e11) {
                                                                    e11.printStackTrace();
                                                                    return;
                                                                }
                                                            }
                                                            return;
                                                        }
                                                    } else if (z12) {
                                                        iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                                                        if (iOnDownLoadH5Source2 != null) {
                                                            iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                                                        }
                                                    } else {
                                                        iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                                                        if (iOnDownLoadH5Source2 != null) {
                                                            iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                                                        }
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    r12 = byteArrayOutputStream;
                                                    if (inputStream != null) {
                                                        try {
                                                            inputStream.close();
                                                            if (r12 != 0) {
                                                                r12.close();
                                                            }
                                                        } catch (Exception e12) {
                                                            e12.printStackTrace();
                                                            e12.getMessage();
                                                            throw th;
                                                        }
                                                    } else if (r12 != 0) {
                                                        r12.close();
                                                    }
                                                    throw th;
                                                }
                                                r11 = 0;
                                                message = e.getMessage();
                                                q0.b(DownLoadUtils.TAG, "getStringFromUrl failed " + e.getLocalizedMessage());
                                                if (inputStream != null) {
                                                    try {
                                                        inputStream.close();
                                                        if (byteArrayOutputStream != 0) {
                                                            byteArrayOutputStream.close();
                                                        }
                                                    } catch (Exception e13) {
                                                        e13.printStackTrace();
                                                        message = e13.getMessage();
                                                    }
                                                } else if (byteArrayOutputStream != 0) {
                                                    byteArrayOutputStream.close();
                                                }
                                            }
                                            if (byteArrayOutputStream.toByteArray() != null) {
                                                byteArray = byteArrayOutputStream.toByteArray();
                                                try {
                                                    str2 = !z10 ? new String(byteArray) : null;
                                                } catch (Exception e14) {
                                                    e = e14;
                                                    r11 = 0;
                                                }
                                            } else {
                                                byteArray = null;
                                                str2 = null;
                                            }
                                            message = "";
                                            z11 = true;
                                            byteArrayOutputStream = byteArrayOutputStream;
                                            r11 = str2;
                                        } catch (Exception e15) {
                                            e = e15;
                                            byteArray = null;
                                            byteArrayOutputStream = byteArray;
                                            r11 = byteArrayOutputStream;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            byteArrayOutputStream = 0;
                                            inputStream2 = inputStream;
                                            r10 = byteArrayOutputStream;
                                            inputStream = inputStream2;
                                            r12 = r10;
                                            if (inputStream != null) {
                                                inputStream.close();
                                                if (r12 != 0) {
                                                    r12.close();
                                                }
                                            } else if (r12 != 0) {
                                                r12.close();
                                            }
                                            throw th;
                                        }
                                    } else {
                                        message = "responseCode is " + responseCode;
                                        inputStream = null;
                                        byteArray = null;
                                        byteArrayOutputStream = 0;
                                        r11 = 0;
                                        z11 = false;
                                    }
                                    httpsURLConnection.disconnect();
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (Exception e16) {
                                            e16.printStackTrace();
                                            message = e16.getMessage();
                                        }
                                    }
                                    if (byteArrayOutputStream != 0) {
                                        byteArrayOutputStream.close();
                                    }
                                    z12 = z11;
                                } catch (Exception e17) {
                                    e = e17;
                                    message = e.getMessage();
                                    q0.b(DownLoadUtils.TAG, "getStringFromUrl failed " + e.getLocalizedMessage());
                                    if (inputStream != null) {
                                        inputStream.close();
                                        if (byteArrayOutputStream != 0) {
                                            byteArrayOutputStream.close();
                                        }
                                    } else if (byteArrayOutputStream != 0) {
                                        byteArrayOutputStream.close();
                                    }
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                inputStream2 = inputStream;
                                r10 = byteArrayOutputStream;
                                inputStream = inputStream2;
                                r12 = r10;
                                if (inputStream != null) {
                                    inputStream.close();
                                    if (r12 != 0) {
                                        r12.close();
                                    }
                                } else if (r12 != 0) {
                                    r12.close();
                                }
                                throw th;
                            }
                        } catch (Exception e18) {
                            e = e18;
                            inputStream = null;
                            byteArray = null;
                        } catch (Throwable th6) {
                            th = th6;
                            r10 = 0;
                            inputStream = inputStream2;
                            r12 = r10;
                            if (inputStream != null) {
                                inputStream.close();
                                if (r12 != 0) {
                                    r12.close();
                                }
                            } else if (r12 != 0) {
                                r12.close();
                            }
                            throw th;
                        }
                        if (z12) {
                            if (!z10) {
                                if (z12) {
                                    iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                                    if (iOnDownLoadH5Source2 != null) {
                                        iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                                    }
                                } else {
                                    iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                                    if (iOnDownLoadH5Source2 != null) {
                                        iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                                    }
                                }
                            } else if (z12) {
                                iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                                if (iOnDownLoadH5Source2 != null) {
                                    iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                                }
                            } else {
                                iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                                if (iOnDownLoadH5Source2 != null) {
                                    iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                                }
                            }
                        } else if (z12) {
                            iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                            if (iOnDownLoadH5Source2 != null) {
                                iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                            }
                        } else {
                            iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                            if (iOnDownLoadH5Source2 != null) {
                                iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                            }
                        }
                    }

                    @Override // com.mbridge.msdk.foundation.same.task.a
                    public void cancelTask() {
                    }

                    @Override // com.mbridge.msdk.foundation.same.task.a
                    public void pauseTask(boolean z11) {
                    }
                });
                return;
            }
            if (iOnDownLoadH5Source != null) {
                iOnDownLoadH5Source.onFailed("url is error");
            }
        } catch (Throwable th2) {
            if (MBridgeConstans.DEBUG) {
                th2.printStackTrace();
            }
        }
    }
}
