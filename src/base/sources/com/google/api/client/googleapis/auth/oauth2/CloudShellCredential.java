package com.google.api.client.googleapis.auth.oauth2;

import com.google.api.client.auth.oauth2.TokenResponse;
import com.google.api.client.json.JsonFactory;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class CloudShellCredential extends GoogleCredential {
    private static final int ACCESS_TOKEN_INDEX = 2;
    protected static final String GET_AUTH_TOKEN_REQUEST = "2\n[]";
    private static final int READ_TIMEOUT_MS = 5000;
    private final int authPort;
    private final JsonFactory jsonFactory;

    public CloudShellCredential(int i10, JsonFactory jsonFactory) {
        this.authPort = i10;
        this.jsonFactory = jsonFactory;
    }

    @Override // com.google.api.client.googleapis.auth.oauth2.GoogleCredential, com.google.api.client.auth.oauth2.Credential
    protected TokenResponse executeRefreshToken() throws IOException {
        Socket socket = new Socket("localhost", getAuthPort());
        socket.setSoTimeout(5000);
        TokenResponse tokenResponse = new TokenResponse();
        try {
            new PrintWriter(socket.getOutputStream(), true).println(GET_AUTH_TOKEN_REQUEST);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            bufferedReader.readLine();
            tokenResponse.setAccessToken(((List) this.jsonFactory.createJsonParser(bufferedReader).parseArray(LinkedList.class, Object.class)).get(2).toString());
            return tokenResponse;
        } finally {
            socket.close();
        }
    }

    protected int getAuthPort() {
        return this.authPort;
    }
}
