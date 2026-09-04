package rf;

import com.google.api.services.youtube.YouTube;
import com.google.api.services.youtube.model.LiveChatMessage;
import com.google.api.services.youtube.model.LiveChatMessageListResponse;
import com.google.common.collect.c0;
import gn.b0;
import gn.d0;
import gn.g0;
import java.io.IOException;
import java.util.Arrays;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.s;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private YouTube f51329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f51330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private tg.b f51331c;

    public void a() {
        this.f51331c = null;
    }

    public String b() {
        try {
            YouTube youTube = this.f51329a;
            if (youTube == null) {
                return null;
            }
            s.e(youTube);
            YouTube.LiveChatMessages.List list = youTube.liveChatMessages().list(this.f51330b, c0.E("snippet", "authorDetails"));
            s.g(list, "list(...)");
            LiveChatMessageListResponse liveChatMessageListResponseExecute = list.execute();
            int size = liveChatMessageListResponseExecute.getItems().size();
            if (size > 0) {
                LiveChatMessage liveChatMessage = liveChatMessageListResponseExecute.getItems().get(size - 1);
                String messageText = liveChatMessage.getSnippet().getTextMessageDetails().getMessageText();
                return liveChatMessage.getAuthorDetails().getDisplayName() + ": " + messageText;
            }
        } catch (IOException e10) {
            e10.printStackTrace();
            com.google.firebase.crashlytics.a.b().d(e10);
        }
        return null;
    }

    public final tg.b c(String accessToken) {
        s.h(accessToken, "accessToken");
        if (this.f51331c == null) {
            b0 b0Var = new b0();
            d0.a aVarV = new d0.a().v("https://www.googleapis.com/oauth2/v3/userinfo");
            o0 o0Var = o0.f43602a;
            String str = String.format("Bearer %s", Arrays.copyOf(new Object[]{accessToken}, 1));
            s.g(str, "format(...)");
            try {
                g0 g0VarD = b0Var.a(aVarV.a("Authorization", str).b()).execute().d();
                s.e(g0VarD);
                String strString = g0VarD.string();
                wp.a.a("User Info Response %s", strString);
                JSONObject jSONObject = new JSONObject(strString);
                String strOptString = jSONObject.optString("name", null);
                String strOptString2 = jSONObject.optString("picture", null);
                s.e(strOptString);
                this.f51331c = new tg.b(strOptString, strOptString2);
            } catch (Exception e10) {
                wp.a.e(e10);
                com.google.firebase.crashlytics.a.b().d(e10);
            }
        }
        return this.f51331c;
    }

    public final tg.b d() {
        return this.f51331c;
    }

    public final void e(String str) {
        this.f51330b = str;
    }

    public final void f(YouTube youTube) {
        this.f51329a = youTube;
    }
}
