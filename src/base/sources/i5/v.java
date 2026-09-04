package i5;

import android.net.Uri;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f41084a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f41085b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f41086c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final /* synthetic */ int[] f41087d;

        static {
            int[] iArr = new int[androidx.work.p.values().length];
            f41087d = iArr;
            try {
                iArr[androidx.work.p.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41087d[androidx.work.p.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[androidx.work.m.values().length];
            f41086c = iArr2;
            try {
                iArr2[androidx.work.m.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41086c[androidx.work.m.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f41086c[androidx.work.m.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f41086c[androidx.work.m.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f41086c[androidx.work.m.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[androidx.work.a.values().length];
            f41085b = iArr3;
            try {
                iArr3[androidx.work.a.EXPONENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f41085b[androidx.work.a.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr4 = new int[androidx.work.u.values().length];
            f41084a = iArr4;
            try {
                iArr4[androidx.work.u.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f41084a[androidx.work.u.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f41084a[androidx.work.u.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f41084a[androidx.work.u.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f41084a[androidx.work.u.BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f41084a[androidx.work.u.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    public static int a(androidx.work.a aVar) {
        int i10 = a.f41085b[aVar.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        throw new IllegalArgumentException("Could not convert " + aVar + " to int");
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0051 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static androidx.work.d b(byte[] bArr) throws Throwable {
        Throwable th2;
        ObjectInputStream objectInputStream;
        IOException e10;
        androidx.work.d dVar = new androidx.work.d();
        if (bArr != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            ObjectInputStream objectInputStream2 = null;
            try {
                try {
                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        for (int i10 = objectInputStream.readInt(); i10 > 0; i10--) {
                            dVar.a(Uri.parse(objectInputStream.readUTF()), objectInputStream.readBoolean());
                        }
                    } catch (IOException e11) {
                        e10 = e11;
                        e10.printStackTrace();
                        if (objectInputStream != null) {
                        }
                        byteArrayInputStream.close();
                        return dVar;
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    if (0 != 0) {
                        try {
                            objectInputStream2.close();
                        } catch (IOException e12) {
                            e12.printStackTrace();
                        }
                    }
                    try {
                        byteArrayInputStream.close();
                        throw th2;
                    } catch (IOException e13) {
                        e13.printStackTrace();
                        throw th2;
                    }
                }
            } catch (IOException e14) {
                objectInputStream = null;
                e10 = e14;
            } catch (Throwable th4) {
                th2 = th4;
                if (0 != 0) {
                    objectInputStream2.close();
                }
                byteArrayInputStream.close();
                throw th2;
            }
            try {
                objectInputStream.close();
            } catch (IOException e15) {
                e15.printStackTrace();
            }
            try {
                byteArrayInputStream.close();
            } catch (IOException e16) {
                e16.printStackTrace();
            }
        }
        return dVar;
    }

    public static byte[] c(androidx.work.d dVar) throws Throwable {
        ObjectOutputStream objectOutputStream = null;
        if (dVar.c() == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                try {
                    ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                    try {
                        try {
                            objectOutputStream2.writeInt(dVar.c());
                            for (androidx.work.d.a aVar : dVar.b()) {
                                objectOutputStream2.writeUTF(aVar.a().toString());
                                objectOutputStream2.writeBoolean(aVar.b());
                            }
                            objectOutputStream2.close();
                        } catch (IOException e10) {
                            e = e10;
                            objectOutputStream = objectOutputStream2;
                            e.printStackTrace();
                            if (objectOutputStream != null) {
                                objectOutputStream.close();
                            }
                            byteArrayOutputStream.close();
                            return byteArrayOutputStream.toByteArray();
                        } catch (Throwable th2) {
                            th = th2;
                            objectOutputStream = objectOutputStream2;
                            if (objectOutputStream != null) {
                                try {
                                    objectOutputStream.close();
                                } catch (IOException e11) {
                                    e11.printStackTrace();
                                }
                            }
                            try {
                                byteArrayOutputStream.close();
                                throw th;
                            } catch (IOException e12) {
                                e12.printStackTrace();
                                throw th;
                            }
                        }
                        byteArrayOutputStream.close();
                    } catch (IOException e13) {
                        e13.printStackTrace();
                    }
                } catch (IOException e14) {
                    e = e14;
                }
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e15) {
            e15.printStackTrace();
        }
    }

    public static androidx.work.a d(int i10) {
        if (i10 == 0) {
            return androidx.work.a.EXPONENTIAL;
        }
        if (i10 == 1) {
            return androidx.work.a.LINEAR;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to BackoffPolicy");
    }

    public static androidx.work.m e(int i10) {
        if (i10 == 0) {
            return androidx.work.m.NOT_REQUIRED;
        }
        if (i10 == 1) {
            return androidx.work.m.CONNECTED;
        }
        if (i10 == 2) {
            return androidx.work.m.UNMETERED;
        }
        if (i10 == 3) {
            return androidx.work.m.NOT_ROAMING;
        }
        if (i10 == 4) {
            return androidx.work.m.METERED;
        }
        if (Build.VERSION.SDK_INT >= 30 && i10 == 5) {
            return androidx.work.m.TEMPORARILY_UNMETERED;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to NetworkType");
    }

    public static androidx.work.p f(int i10) {
        if (i10 == 0) {
            return androidx.work.p.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (i10 == 1) {
            return androidx.work.p.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to OutOfQuotaPolicy");
    }

    public static androidx.work.u g(int i10) {
        if (i10 == 0) {
            return androidx.work.u.ENQUEUED;
        }
        if (i10 == 1) {
            return androidx.work.u.RUNNING;
        }
        if (i10 == 2) {
            return androidx.work.u.SUCCEEDED;
        }
        if (i10 == 3) {
            return androidx.work.u.FAILED;
        }
        if (i10 == 4) {
            return androidx.work.u.BLOCKED;
        }
        if (i10 == 5) {
            return androidx.work.u.CANCELLED;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to State");
    }

    public static int h(androidx.work.m mVar) {
        int i10 = a.f41086c[mVar.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        if (i10 == 5) {
            return 4;
        }
        if (Build.VERSION.SDK_INT >= 30 && mVar == androidx.work.m.TEMPORARILY_UNMETERED) {
            return 5;
        }
        throw new IllegalArgumentException("Could not convert " + mVar + " to int");
    }

    public static int i(androidx.work.p pVar) {
        int i10 = a.f41087d[pVar.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        throw new IllegalArgumentException("Could not convert " + pVar + " to int");
    }

    public static int j(androidx.work.u uVar) {
        switch (a.f41084a[uVar.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new IllegalArgumentException("Could not convert " + uVar + " to int");
        }
    }
}
