package net.openid.appauth;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class AuthorizationManagementActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f47347a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Intent f47348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f47349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PendingIntent f47350d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PendingIntent f47351e;

    public static Intent a(Context context) {
        return new Intent(context, (Class<?>) AuthorizationManagementActivity.class);
    }

    public static Intent b(Context context, Uri uri) {
        Intent intentA = a(context);
        intentA.setData(uri);
        intentA.addFlags(603979776);
        return intentA;
    }

    public static Intent c(Context context, d dVar, Intent intent) {
        return d(context, dVar, intent, null, null);
    }

    public static Intent d(Context context, d dVar, Intent intent, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        Intent intentA = a(context);
        intentA.putExtra("authIntent", intent);
        intentA.putExtra("authRequest", dVar.g());
        intentA.putExtra("completeIntent", pendingIntent);
        intentA.putExtra("cancelIntent", pendingIntent2);
        return intentA;
    }

    private Intent e(Uri uri) {
        if (uri.getQueryParameterNames().contains("error")) {
            return AuthorizationException.k(uri).o();
        }
        e eVarA = new e.b(this.f47349c).b(uri).a();
        String str = this.f47349c.f47418i;
        if ((str != null || eVarA.f47442b == null) && (str == null || str.equals(eVarA.f47442b))) {
            return eVarA.i();
        }
        zm.a.g("State returned in authorization response (%s) does not match state from request (%s) - discarding response", eVarA.f47442b, this.f47349c.f47418i);
        return AuthorizationException.a.f47326j.o();
    }

    private void f(Bundle bundle) {
        if (bundle == null) {
            zm.a.g("No stored state - unable to handle response", new Object[0]);
            finish();
            return;
        }
        this.f47348b = (Intent) bundle.getParcelable("authIntent");
        this.f47347a = bundle.getBoolean("authStarted", false);
        try {
            String string = bundle.getString("authRequest", null);
            this.f47349c = string != null ? d.d(string) : null;
            this.f47350d = (PendingIntent) bundle.getParcelable("completeIntent");
            this.f47351e = (PendingIntent) bundle.getParcelable("cancelIntent");
        } catch (JSONException e10) {
            throw new IllegalStateException("Unable to deserialize authorization request", e10);
        }
    }

    private void g() {
        zm.a.a("Authorization flow canceled by user", new Object[0]);
        Intent intentO = AuthorizationException.m(AuthorizationException.b.f47329b, null).o();
        PendingIntent pendingIntent = this.f47351e;
        if (pendingIntent == null) {
            setResult(0, intentO);
            zm.a.a("No cancel intent set - will return to previous activity", new Object[0]);
        } else {
            try {
                pendingIntent.send(this, 0, intentO);
            } catch (PendingIntent.CanceledException e10) {
                zm.a.c("Failed to send cancel intent", e10);
            }
        }
    }

    private void h() {
        Uri data = getIntent().getData();
        Intent intentE = e(data);
        if (intentE == null) {
            zm.a.c("Failed to extract OAuth2 response from redirect", new Object[0]);
            return;
        }
        intentE.setData(data);
        if (this.f47350d == null) {
            setResult(-1, intentE);
            return;
        }
        zm.a.a("Authorization complete - invoking completion intent", new Object[0]);
        try {
            this.f47350d.send(this, 0, intentE);
        } catch (PendingIntent.CanceledException e10) {
            zm.a.c("Failed to send completion intent", e10);
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            f(getIntent().getExtras());
        } else {
            f(bundle);
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (!this.f47347a) {
            startActivity(this.f47348b);
            this.f47347a = true;
        } else {
            if (getIntent().getData() != null) {
                h();
            } else {
                g();
            }
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("authStarted", this.f47347a);
        bundle.putParcelable("authIntent", this.f47348b);
        bundle.putString("authRequest", this.f47349c.g());
        bundle.putParcelable("completeIntent", this.f47350d);
        bundle.putParcelable("cancelIntent", this.f47351e);
    }
}
