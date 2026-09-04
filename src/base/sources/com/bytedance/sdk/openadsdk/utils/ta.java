package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ta {

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.ta$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class AnonymousClass1 implements FilenameFilter {
        private final Pattern hnj = Pattern.compile("^cpu[0-9]+$");

        AnonymousClass1() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return this.hnj.matcher(str).matches();
        }
    }

    public static int gjv() {
        return com.bytedance.sdk.openadsdk.core.qor.hnj().hn("cpu_min_frequency", 0);
    }

    public static int hn() {
        return com.bytedance.sdk.openadsdk.core.qor.hnj().hn("cpu_count", 0);
    }

    public static int hnj() {
        return Math.max(Runtime.getRuntime().availableProcessors(), 0);
    }

    public static int qor() {
        return com.bytedance.sdk.openadsdk.core.qor.hnj().hn("cpu_max_frequency", 0);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0061 A[Catch: Exception -> 0x0064, TRY_LEAVE, TryCatch #3 {Exception -> 0x0064, blocks: (B:24:0x005c, B:26:0x0061), top: B:44:0x005c }] */
    /* JADX WARN: Code duplicated, block: B:32:0x006e A[Catch: Exception -> 0x0071, TRY_LEAVE, TryCatch #6 {Exception -> 0x0071, blocks: (B:30:0x0069, B:32:0x006e), top: B:50:0x0069 }] */
    public static int hn(int i10) {
        BufferedReader bufferedReader;
        Throwable th2;
        int i11;
        int i12 = 0;
        FileReader fileReader = null;
        BufferedReader bufferedReader2 = null;
        while (true) {
            i10--;
            if (i10 < 0) {
                return i12;
            }
            try {
                FileReader fileReader2 = new FileReader("/sys/devices/system/cpu/cpu" + i10 + "/cpufreq/cpuinfo_min_freq");
                try {
                    BufferedReader bufferedReader3 = new BufferedReader(fileReader2);
                    try {
                        String line = bufferedReader3.readLine();
                        if (!TextUtils.isEmpty(line) && ((i11 = Integer.parseInt(line)) < i12 || i12 == 0)) {
                            i12 = i11;
                        }
                        try {
                            bufferedReader3.close();
                            fileReader2.close();
                        } catch (Exception unused) {
                        }
                        bufferedReader2 = bufferedReader3;
                        fileReader = fileReader2;
                    } catch (Throwable th3) {
                        th2 = th3;
                        bufferedReader = bufferedReader3;
                        fileReader = fileReader2;
                        try {
                            com.bytedance.sdk.component.utils.apu.qor("CpuUtils", th2.getMessage());
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                    if (fileReader != null) {
                                        fileReader.close();
                                    }
                                } catch (Exception unused2) {
                                    bufferedReader2 = bufferedReader;
                                }
                            } else if (fileReader != null) {
                                fileReader.close();
                            }
                            bufferedReader2 = bufferedReader;
                        } catch (Throwable th4) {
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                    if (fileReader != null) {
                                        fileReader.close();
                                    }
                                } catch (Exception unused3) {
                                    throw th4;
                                }
                            } else if (fileReader != null) {
                                fileReader.close();
                            }
                            throw th4;
                        }
                    }
                } catch (Throwable th5) {
                    BufferedReader bufferedReader4 = bufferedReader2;
                    th2 = th5;
                    fileReader = fileReader2;
                    bufferedReader = bufferedReader4;
                }
            } catch (Throwable th6) {
                bufferedReader = bufferedReader2;
                th2 = th6;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005e A[Catch: Exception -> 0x0061, TRY_LEAVE, TryCatch #5 {Exception -> 0x0061, blocks: (B:22:0x0059, B:24:0x005e), top: B:46:0x0059 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x006b A[Catch: Exception -> 0x006e, TRY_LEAVE, TryCatch #0 {Exception -> 0x006e, blocks: (B:28:0x0066, B:30:0x006b), top: B:36:0x0066 }] */
    public static int hnj(int i10) {
        BufferedReader bufferedReader;
        Throwable th2;
        int i11;
        int i12 = 0;
        FileReader fileReader = null;
        BufferedReader bufferedReader2 = null;
        while (true) {
            i10--;
            if (i10 < 0) {
                return i12;
            }
            try {
                FileReader fileReader2 = new FileReader("/sys/devices/system/cpu/cpu" + i10 + "/cpufreq/cpuinfo_max_freq");
                try {
                    BufferedReader bufferedReader3 = new BufferedReader(fileReader2);
                    try {
                        String line = bufferedReader3.readLine();
                        if (!TextUtils.isEmpty(line) && (i11 = Integer.parseInt(line)) > i12) {
                            i12 = i11;
                        }
                        try {
                            bufferedReader3.close();
                            fileReader2.close();
                        } catch (Exception unused) {
                        }
                        bufferedReader2 = bufferedReader3;
                        fileReader = fileReader2;
                    } catch (Throwable th3) {
                        th2 = th3;
                        bufferedReader = bufferedReader3;
                        fileReader = fileReader2;
                        try {
                            com.bytedance.sdk.component.utils.apu.qor("CpuUtils", th2.getMessage());
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                    if (fileReader != null) {
                                        fileReader.close();
                                    }
                                } catch (Exception unused2) {
                                    bufferedReader2 = bufferedReader;
                                }
                            } else if (fileReader != null) {
                                fileReader.close();
                            }
                            bufferedReader2 = bufferedReader;
                        } catch (Throwable th4) {
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                    if (fileReader != null) {
                                        fileReader.close();
                                    }
                                } catch (Exception unused3) {
                                    throw th4;
                                }
                            } else if (fileReader != null) {
                                fileReader.close();
                            }
                            throw th4;
                        }
                    }
                } catch (Throwable th5) {
                    BufferedReader bufferedReader4 = bufferedReader2;
                    th2 = th5;
                    fileReader = fileReader2;
                    bufferedReader = bufferedReader4;
                }
            } catch (Throwable th6) {
                bufferedReader = bufferedReader2;
                th2 = th6;
            }
        }
    }
}
