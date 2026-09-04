package com.facebook.appevents;

import android.content.Context;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f14928a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f14929b = f.class.getName();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a extends ObjectInputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0262a f14930a = new C0262a(null);

        /* JADX INFO: renamed from: com.facebook.appevents.f$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class C0262a {
            public /* synthetic */ C0262a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0262a() {
            }
        }

        public a(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.ObjectInputStream
        protected ObjectStreamClass readClassDescriptor() throws ClassNotFoundException, IOException {
            ObjectStreamClass resultClassDescriptor = super.readClassDescriptor();
            if (kotlin.jvm.internal.s.c(resultClassDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1")) {
                resultClassDescriptor = ObjectStreamClass.lookup(com.facebook.appevents.a.b.class);
            } else if (kotlin.jvm.internal.s.c(resultClassDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV2")) {
                resultClassDescriptor = ObjectStreamClass.lookup(d.b.class);
            }
            kotlin.jvm.internal.s.g(resultClassDescriptor, "resultClassDescriptor");
            return resultClassDescriptor;
        }
    }

    private f() {
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x004d: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:78), block:B:24:0x004d */
    public static final synchronized s0 a() {
        s0 s0Var;
        String str;
        s0 s0Var2;
        Throwable th2;
        n7.h.b();
        Context contextM = com.facebook.h0.m();
        s0 s0Var3 = null;
        try {
            try {
                try {
                    FileInputStream fileInputStreamOpenFileInput = contextM.openFileInput("AppEventsLogger.persistedevents");
                    kotlin.jvm.internal.s.g(fileInputStreamOpenFileInput, "context.openFileInput(PERSISTED_EVENTS_FILENAME)");
                    a aVar = new a(new BufferedInputStream(fileInputStreamOpenFileInput));
                    try {
                        Object object = aVar.readObject();
                        kotlin.jvm.internal.s.f(object, "null cannot be cast to non-null type com.facebook.appevents.PersistedEvents");
                        s0Var2 = (s0) object;
                        try {
                            fl.g0 g0Var = fl.g0.f38750a;
                            ql.b.a(aVar, null);
                            try {
                                contextM.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                            } catch (Exception e10) {
                                e = e10;
                                str = f14929b;
                                Log.w(str, "Got unexpected exception when removing events file: ", e);
                            }
                        } catch (Throwable th3) {
                            th2 = th3;
                            try {
                                throw th2;
                            } catch (Throwable th4) {
                                ql.b.a(aVar, th2);
                                throw th4;
                            }
                        }
                    } catch (Throwable th5) {
                        th2 = th5;
                    }
                } catch (Throwable th6) {
                    try {
                        contextM.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                    } catch (Exception e11) {
                        Log.w(f14929b, "Got unexpected exception when removing events file: ", e11);
                    }
                    throw th6;
                }
            } catch (FileNotFoundException unused) {
                try {
                    contextM.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                } catch (Exception e12) {
                    Log.w(f14929b, "Got unexpected exception when removing events file: ", e12);
                }
                s0Var2 = s0Var3;
            } catch (IOException e13) {
                s0Var2 = null;
                e = e13;
                Log.w(f14929b, "Got unexpected exception while reading events: ", e);
                try {
                    contextM.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                } catch (Exception e14) {
                    e = e14;
                    str = f14929b;
                    Log.w(str, "Got unexpected exception when removing events file: ", e);
                }
            } catch (ClassNotFoundException e15) {
                s0Var2 = null;
                e = e15;
                Log.w(f14929b, "Got unexpected exception while reading events: ", e);
                try {
                    contextM.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                } catch (Exception e16) {
                    e = e16;
                    str = f14929b;
                    Log.w(str, "Got unexpected exception when removing events file: ", e);
                }
            }
        } catch (FileNotFoundException unused2) {
            s0Var3 = s0Var;
            contextM.getFileStreamPath("AppEventsLogger.persistedevents").delete();
            s0Var2 = s0Var3;
        } catch (IOException e17) {
            e = e17;
            Log.w(f14929b, "Got unexpected exception while reading events: ", e);
            contextM.getFileStreamPath("AppEventsLogger.persistedevents").delete();
        } catch (ClassNotFoundException e18) {
            e = e18;
            Log.w(f14929b, "Got unexpected exception while reading events: ", e);
            contextM.getFileStreamPath("AppEventsLogger.persistedevents").delete();
        }
        if (s0Var2 == null) {
            s0Var2 = new s0();
        }
        return s0Var2;
    }

    public static final void b(s0 s0Var) {
        Context contextM = com.facebook.h0.m();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(contextM.openFileOutput("AppEventsLogger.persistedevents", 0)));
            try {
                objectOutputStream.writeObject(s0Var);
                fl.g0 g0Var = fl.g0.f38750a;
                ql.b.a(objectOutputStream, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    ql.b.a(objectOutputStream, th2);
                    throw th3;
                }
            }
        } catch (IOException e10) {
            Log.w(f14929b, "Got unexpected exception while persisting events: ", e10);
            try {
                contextM.getFileStreamPath("AppEventsLogger.persistedevents").delete();
            } catch (Exception unused) {
            }
        }
    }
}
