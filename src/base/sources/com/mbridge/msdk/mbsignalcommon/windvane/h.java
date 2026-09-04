package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class h implements b, Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Pattern f31726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f31727b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected Context f31729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected WindVaneWebView f31730e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f31728c = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected Handler f31731f = new Handler(Looper.getMainLooper(), this);

    public h(Context context) {
        this.f31729d = context;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.b
    public void a(WindVaneWebView windVaneWebView) {
        this.f31730e = windVaneWebView;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.b
    public boolean b(String str) {
        if (!i.f(str)) {
            return false;
        }
        a(i.c(str));
        d(str);
        return true;
    }

    public a c(String str) {
        if (str == null) {
            return null;
        }
        a aVarA = com.mbridge.msdk.mbsignalcommon.mraid.c.a(this.f31730e, str);
        if (aVarA != null) {
            aVarA.f31700b = this.f31730e;
            return aVarA;
        }
        Matcher matcher = this.f31726a.matcher(str);
        if (matcher.matches()) {
            a aVar = new a();
            int iGroupCount = matcher.groupCount();
            if (iGroupCount >= 5) {
                aVar.f31704f = matcher.group(5);
            }
            if (iGroupCount >= 3) {
                aVar.f31702d = matcher.group(1);
                aVar.f31705g = matcher.group(2);
                String strGroup = matcher.group(3);
                aVar.f31703e = strGroup;
                HashMap<String, String> map = com.mbridge.msdk.mbsignalcommon.base.e.f31601k;
                if (map != null && map.containsKey(strGroup)) {
                    aVar.f31703e = com.mbridge.msdk.mbsignalcommon.base.e.f31601k.get(aVar.f31703e);
                }
                aVar.f31700b = this.f31730e;
                return aVar;
            }
        }
        return null;
    }

    public void d(String str) {
        this.f31727b = str;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        a aVar = (a) message.obj;
        if (aVar == null) {
            return false;
        }
        try {
            if (message.what == 1) {
                Object obj = aVar.f31701c;
                com.mbridge.msdk.mbsignalcommon.mapping.b.C0422b c0422b = aVar.f31699a;
                if (c0422b != null && obj != null) {
                    c0422b.a(obj, aVar, TextUtils.isEmpty(aVar.f31704f) ? "{}" : aVar.f31704f);
                }
                return true;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return false;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.b
    public void a(String str) {
        a aVarC;
        if (TextUtils.isEmpty(str) || (aVarC = c(str)) == null) {
            return;
        }
        a(aVarC);
    }

    protected void a(a aVar) {
        WindVaneWebView windVaneWebView = aVar.f31700b;
        Object jsObject = windVaneWebView == null ? null : windVaneWebView.getJsObject(aVar.f31702d);
        if (jsObject == null) {
            return;
        }
        try {
            com.mbridge.msdk.mbsignalcommon.mapping.b.C0422b c0422bA = com.mbridge.msdk.mbsignalcommon.mapping.b.a(this.f31729d.getClassLoader(), jsObject.getClass().getName()).a(aVar.f31703e, Object.class, String.class);
            c0422bA.a();
            if (jsObject instanceof g) {
                aVar.f31699a = c0422bA;
                aVar.f31701c = jsObject;
                a(1, aVar);
            }
        } catch (com.mbridge.msdk.mbsignalcommon.mapping.a e10) {
            e10.printStackTrace();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    protected void a(int i10, a aVar) {
        Message messageObtain = Message.obtain();
        messageObtain.what = i10;
        messageObtain.obj = aVar;
        this.f31731f.sendMessage(messageObtain);
    }

    public void a(Pattern pattern) {
        this.f31726a = pattern;
    }
}
