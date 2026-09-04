package com.inmobi.media;

import com.mbridge.msdk.foundation.download.Command;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class B4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gn.z[] f24497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gn.b0 f24498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f24499c;

    public B4(gn.z[] zVarArr, gn.z[] zVarArr2, gn.q dispatcher, Gk timeoutConfig) {
        kotlin.jvm.internal.s.h(dispatcher, "dispatcher");
        kotlin.jvm.internal.s.h(timeoutConfig, "timeoutConfig");
        this.f24497a = zVarArr2;
        this.f24499c = timeoutConfig.f24879c;
        gn.b0.a aVar = new gn.b0.a();
        if (zVarArr != null) {
            for (gn.z zVar : zVarArr) {
                aVar.a(zVar);
            }
        }
        gn.z[] zVarArr3 = this.f24497a;
        if (zVarArr3 != null) {
            for (gn.z zVar2 : zVarArr3) {
                aVar.b(zVar2);
            }
        }
        aVar.a(new Mi());
        aVar.b(new C2963fc());
        aVar.P(gl.r.q(gn.c0.HTTP_2, gn.c0.HTTP_1_1));
        aVar.S(false);
        aVar.f(dispatcher);
        long j10 = timeoutConfig.f24877a;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        aVar.e(j10, timeUnit);
        aVar.R(timeoutConfig.f24878b, timeUnit);
        gn.b0 b0VarC = aVar.c();
        kotlin.jvm.internal.s.g(b0VarC, "build(...)");
        this.f24498b = b0VarC;
    }

    public static fl.q a(Ue ue2) {
        gn.e0 c3446y4;
        Set setKeySet;
        gn.y yVarK = gn.y.k(ue2.c());
        if (yVarK == null) {
            ue2.c();
            return new fl.q(null, new C2957f6(ue2.c(), EnumC2931e6.f26468s));
        }
        gn.d0.a aVarU = new gn.d0.a().u(yVarK);
        Map mapA = ue2.a();
        if (mapA != null) {
            for (Map.Entry entry : mapA.entrySet()) {
                aVarU.a((String) entry.getKey(), (String) entry.getValue());
            }
        }
        Map mapA2 = ue2.a();
        if (mapA2 != null && (setKeySet = mapA2.keySet()) != null && !setKeySet.isEmpty()) {
            Iterator it = setKeySet.iterator();
            do {
                if (!it.hasNext()) {
                    aVarU.a(Command.HTTP_HEADER_USER_AGENT, Xi.c());
                    break;
                }
            } while (!kotlin.jvm.internal.s.c((String) it.next(), Command.HTTP_HEADER_USER_AGENT));
        } else {
            aVarU.a(Command.HTTP_HEADER_USER_AGENT, Xi.c());
            break;
        }
        Ni niB = ue2.b();
        if (niB != null) {
            aVarU.s(niB);
        }
        if (ue2 instanceof Re) {
            aVarU.f();
        } else if (ue2 instanceof Te) {
            try {
                Hi hi2 = ((Te) ue2).f25759d;
                if (hi2 == null) {
                    c3446y4 = gn.e0.create((gn.a0) null, new byte[0]);
                    kotlin.jvm.internal.s.e(c3446y4);
                } else {
                    c3446y4 = new C3446y4(hi2);
                }
                aVarU.q(c3446y4);
            } catch (FileNotFoundException e10) {
                e10.getStackTrace();
                return new fl.q(aVarU.b(), new C2957f6(((Te) ue2).f25756a, EnumC2931e6.f26462m));
            } catch (IOException e11) {
                e11.getStackTrace();
                return new fl.q(aVarU.b(), new C2957f6(((Te) ue2).f25756a, EnumC2931e6.f26454e));
            } catch (Exception e12) {
                e12.getStackTrace();
                return new fl.q(aVarU.b(), new C2957f6(((Te) ue2).f25756a, EnumC2931e6.f26453d));
            }
        } else {
            if (!(ue2 instanceof Se)) {
                throw new NoWhenBranchMatchedException();
            }
            aVarU.m();
        }
        return new fl.q(aVarU.b(), null);
    }

    /* JADX WARN: Code duplicated, block: B:120:0x016b  */
    /* JADX WARN: Code duplicated, block: B:124:0x0183  */
    /* JADX WARN: Code duplicated, block: B:128:0x019b  */
    /* JADX WARN: Code duplicated, block: B:132:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:136:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:142:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(gn.b0 b0Var, gn.d0 d0Var, String str, kotlin.coroutines.jvm.internal.d dVar) throws Throwable {
        C3471z4 c3471z4;
        String str2;
        String str3;
        xn.h hVarB0;
        Object we2;
        gn.a0 a0VarContentType;
        xn.g gVarSource;
        if (dVar instanceof C3471z4) {
            c3471z4 = (C3471z4) dVar;
            int i10 = c3471z4.f27975d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3471z4.f27975d = i10 - Integer.MIN_VALUE;
            } else {
                c3471z4 = new C3471z4(this, dVar);
            }
        } else {
            c3471z4 = new C3471z4(this, dVar);
        }
        Object objC = c3471z4.f27973b;
        Object objF = ll.b.f();
        int i11 = c3471z4.f27975d;
        gn.f0 f0Var = null;
        string = null;
        String string = null;
        f0Var = null;
        f0Var = null;
        f0Var = null;
        f0Var = null;
        f0Var = null;
        f0Var = null;
        gn.f0 f0Var2 = null;
        gn.f0 f0Var3 = null;
        gn.f0 f0Var4 = null;
        gn.f0 f0Var5 = null;
        gn.f0 f0Var6 = null;
        gn.f0 f0Var7 = null;
        try {
            try {
                if (i11 == 0) {
                    fl.s.b(objC);
                    try {
                        long millis = TimeUnit.SECONDS.toMillis(this.f24499c);
                        A4 a10 = new A4(b0Var, d0Var, null);
                        str2 = str;
                        try {
                            c3471z4.f27972a = str2;
                            c3471z4.f27975d = 1;
                            objC = em.z2.c(millis, a10, c3471z4);
                            if (objC == objF) {
                                return objF;
                            }
                            str3 = str2;
                        } catch (MalformedURLException e10) {
                            e = e10;
                            str3 = str2;
                            kotlin.jvm.internal.s.g(Arrays.toString(e.getStackTrace()), "toString(...)");
                            C2957f6 c2957f6 = new C2957f6(str3, EnumC2931e6.f26465p);
                            if (f0Var2 != null) {
                                f0Var2.close();
                            }
                            return c2957f6;
                        } catch (SocketTimeoutException e11) {
                            e = e11;
                            str3 = str2;
                            kotlin.jvm.internal.s.g(Arrays.toString(e.getStackTrace()), "toString(...)");
                            C2957f6 c2957f7 = new C2957f6(str3, EnumC2931e6.f26469t);
                            if (f0Var3 != null) {
                                f0Var3.close();
                            }
                            return c2957f7;
                        } catch (IOException e12) {
                            e = e12;
                            str3 = str2;
                            kotlin.jvm.internal.s.g(Arrays.toString(e.getStackTrace()), "toString(...)");
                            C2957f6 c2957f8 = new C2957f6(str3, EnumC2931e6.f26454e);
                            if (f0Var4 != null) {
                                f0Var4.close();
                            }
                            return c2957f8;
                        } catch (NoSuchElementException e13) {
                            e = e13;
                            str3 = str2;
                            kotlin.jvm.internal.s.g(Arrays.toString(e.getStackTrace()), "toString(...)");
                            C2957f6 c2957f9 = new C2957f6(str3, EnumC2931e6.f26466q);
                            if (f0Var5 != null) {
                                f0Var5.close();
                            }
                            return c2957f9;
                        } catch (TimeoutCancellationException e14) {
                            e = e14;
                            str3 = str2;
                            kotlin.jvm.internal.s.g(Arrays.toString(e.getStackTrace()), "toString(...)");
                            C2957f6 c2957f10 = new C2957f6(str3, EnumC2931e6.f26467r);
                            if (f0Var6 != null) {
                                f0Var6.close();
                            }
                            return c2957f10;
                        } catch (Exception e15) {
                            e = e15;
                            str3 = str2;
                            kotlin.jvm.internal.s.g(Arrays.toString(e.getStackTrace()), "toString(...)");
                            C2957f6 c2957f11 = new C2957f6(str3, EnumC2931e6.f26453d);
                            if (f0Var7 != null) {
                                f0Var7.close();
                            }
                            return c2957f11;
                        }
                    } catch (MalformedURLException e16) {
                        e = e16;
                        str2 = str;
                    } catch (SocketTimeoutException e17) {
                        e = e17;
                        str2 = str;
                    } catch (IOException e18) {
                        e = e18;
                        str2 = str;
                    } catch (NoSuchElementException e19) {
                        e = e19;
                        str2 = str;
                    } catch (TimeoutCancellationException e20) {
                        e = e20;
                        str2 = str;
                    } catch (Exception e21) {
                        e = e21;
                        str2 = str;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str3 = c3471z4.f27972a;
                    try {
                        fl.s.b(objC);
                    } catch (MalformedURLException e22) {
                        e = e22;
                        kotlin.jvm.internal.s.g(Arrays.toString(e.getStackTrace()), "toString(...)");
                        C2957f6 c2957f12 = new C2957f6(str3, EnumC2931e6.f26465p);
                        if (f0Var2 != null) {
                            f0Var2.close();
                        }
                        return c2957f12;
                    } catch (SocketTimeoutException e23) {
                        e = e23;
                        kotlin.jvm.internal.s.g(Arrays.toString(e.getStackTrace()), "toString(...)");
                        C2957f6 c2957f13 = new C2957f6(str3, EnumC2931e6.f26469t);
                        if (f0Var3 != null) {
                            f0Var3.close();
                        }
                        return c2957f13;
                    } catch (IOException e24) {
                        e = e24;
                        kotlin.jvm.internal.s.g(Arrays.toString(e.getStackTrace()), "toString(...)");
                        C2957f6 c2957f14 = new C2957f6(str3, EnumC2931e6.f26454e);
                        if (f0Var4 != null) {
                            f0Var4.close();
                        }
                        return c2957f14;
                    } catch (NoSuchElementException e25) {
                        e = e25;
                        kotlin.jvm.internal.s.g(Arrays.toString(e.getStackTrace()), "toString(...)");
                        C2957f6 c2957f15 = new C2957f6(str3, EnumC2931e6.f26466q);
                        if (f0Var5 != null) {
                            f0Var5.close();
                        }
                        return c2957f15;
                    } catch (TimeoutCancellationException e26) {
                        e = e26;
                        kotlin.jvm.internal.s.g(Arrays.toString(e.getStackTrace()), "toString(...)");
                        C2957f6 c2957f16 = new C2957f6(str3, EnumC2931e6.f26467r);
                        if (f0Var6 != null) {
                            f0Var6.close();
                        }
                        return c2957f16;
                    } catch (Exception e27) {
                        e = e27;
                        kotlin.jvm.internal.s.g(Arrays.toString(e.getStackTrace()), "toString(...)");
                        C2957f6 c2957f17 = new C2957f6(str3, EnumC2931e6.f26453d);
                        if (f0Var7 != null) {
                            f0Var7.close();
                        }
                        return c2957f17;
                    }
                }
                gn.f0 f0Var8 = (gn.f0) objC;
                try {
                    int iM = f0Var8.m();
                    gn.g0 g0VarD = f0Var8.d();
                    if (g0VarD == null || (gVarSource = g0VarD.source()) == null || (hVarB0 = gVarSource.B0()) == null) {
                        hVarB0 = xn.h.f56913e;
                    }
                    Map mapG = f0Var8.d0().g();
                    gn.g0 g0VarD2 = f0Var8.d();
                    long jContentLength = g0VarD2 != null ? g0VarD2.contentLength() : 0L;
                    gn.g0 g0VarD3 = f0Var8.d();
                    if (g0VarD3 != null && (a0VarContentType = g0VarD3.contentType()) != null) {
                        string = a0VarContentType.toString();
                    }
                    long jT0 = f0Var8.T0() - f0Var8.V0();
                    long j10 = 0;
                    if (jT0 >= 0) {
                        j10 = jT0;
                    }
                    kotlin.jvm.internal.s.e(mapG);
                    Qe qe2 = new Qe(j10, mapG, (int) jContentLength, string);
                    kotlin.jvm.internal.s.h(f0Var8, "<this>");
                    int iM2 = f0Var8.m();
                    if (400 <= iM2 && iM2 < 600) {
                        EnumC2931e6.f26451b.getClass();
                        we2 = new C2957f6(str3, C2880c6.a(iM));
                    } else {
                        we2 = new We(str3, iM, hVarB0, qe2);
                    }
                    f0Var8.close();
                    return we2;
                } catch (MalformedURLException e28) {
                    e = e28;
                    f0Var2 = f0Var8;
                    kotlin.jvm.internal.s.g(Arrays.toString(e.getStackTrace()), "toString(...)");
                    C2957f6 c2957f18 = new C2957f6(str3, EnumC2931e6.f26465p);
                    if (f0Var2 != null) {
                        f0Var2.close();
                    }
                    return c2957f18;
                } catch (SocketTimeoutException e29) {
                    e = e29;
                    f0Var3 = f0Var8;
                    kotlin.jvm.internal.s.g(Arrays.toString(e.getStackTrace()), "toString(...)");
                    C2957f6 c2957f19 = new C2957f6(str3, EnumC2931e6.f26469t);
                    if (f0Var3 != null) {
                        f0Var3.close();
                    }
                    return c2957f19;
                } catch (IOException e30) {
                    e = e30;
                    f0Var4 = f0Var8;
                    kotlin.jvm.internal.s.g(Arrays.toString(e.getStackTrace()), "toString(...)");
                    C2957f6 c2957f110 = new C2957f6(str3, EnumC2931e6.f26454e);
                    if (f0Var4 != null) {
                        f0Var4.close();
                    }
                    return c2957f110;
                } catch (NoSuchElementException e31) {
                    e = e31;
                    f0Var5 = f0Var8;
                    kotlin.jvm.internal.s.g(Arrays.toString(e.getStackTrace()), "toString(...)");
                    C2957f6 c2957f111 = new C2957f6(str3, EnumC2931e6.f26466q);
                    if (f0Var5 != null) {
                        f0Var5.close();
                    }
                    return c2957f111;
                } catch (TimeoutCancellationException e32) {
                    e = e32;
                    f0Var6 = f0Var8;
                    kotlin.jvm.internal.s.g(Arrays.toString(e.getStackTrace()), "toString(...)");
                    C2957f6 c2957f112 = new C2957f6(str3, EnumC2931e6.f26467r);
                    if (f0Var6 != null) {
                        f0Var6.close();
                    }
                    return c2957f112;
                } catch (CancellationException e33) {
                    e = e33;
                    kotlin.jvm.internal.s.g(Arrays.toString(e.getStackTrace()), "toString(...)");
                    throw e;
                } catch (Exception e34) {
                    e = e34;
                    f0Var7 = f0Var8;
                    kotlin.jvm.internal.s.g(Arrays.toString(e.getStackTrace()), "toString(...)");
                    C2957f6 c2957f113 = new C2957f6(str3, EnumC2931e6.f26453d);
                    if (f0Var7 != null) {
                        f0Var7.close();
                    }
                    return c2957f113;
                } catch (Throwable th2) {
                    th = th2;
                    f0Var = f0Var8;
                    if (f0Var != null) {
                        f0Var.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (CancellationException e35) {
            e = e35;
        }
    }

    public final Object a(Ue ue2, kotlin.coroutines.jvm.internal.d dVar) {
        gn.b0 b0Var = this.f24498b;
        fl.q qVarA = a(ue2);
        gn.d0 d0Var = (gn.d0) qVarA.d();
        C2957f6 c2957f6 = (C2957f6) qVarA.g();
        if (c2957f6 != null || d0Var == null) {
            return c2957f6 != null ? c2957f6 : new C2957f6(ue2.c(), EnumC2931e6.f26453d);
        }
        return a(b0Var, d0Var, ue2.c(), dVar);
    }
}
