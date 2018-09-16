package com.example.jijin.qrlogin;

import com.android.tools.fd.runtime.IncrementalChange;
import com.android.tools.fd.runtime.InstantReloadException;

public class User {
    public static volatile transient /* synthetic */ IncrementalChange $change;
    public static final long serialVersionUID = 0;
    private String Name;
    private String Password;

    User(Object[] objArr, InstantReloadException instantReloadException) {
        switch (((String) objArr[1]).hashCode()) {
            case -1968665286:
                return;
            case -298313077:
                this();
                return;
            case 976627231:
                this((String) objArr[2], (String) objArr[3]);
                return;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s' with hashcode %s in %s", new Object[]{(String) objArr[1], Integer.valueOf(((String) objArr[1]).hashCode()), "com/example/jijin/qrlogin/User"}));
        }
    }

    public static /* synthetic */ Object access$super(User user, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2128160755:
                return super.toString();
            case -1554832987:
                super.finalize();
                return null;
            case -1021472056:
                super.wait(((Number) objArr[0]).longValue());
                return null;
            case 201261558:
                return super.getClass();
            case 1403628309:
                return new Integer(super.hashCode());
            case 1814730534:
                return new Boolean(super.equals(objArr[0]));
            case 2025021518:
                return super.clone();
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s' with hashcode %s in %s", new Object[]{str, Integer.valueOf(str.hashCode()), "com/example/jijin/qrlogin/User"}));
        }
    }

    public String getName() {
        IncrementalChange incrementalChange = $change;
        if (incrementalChange == null) {
            return this.Name;
        }
        return (String) incrementalChange.access$dispatch("getName.()Ljava/lang/String;", new Object[]{this});
    }

    public String getPassword() {
        IncrementalChange incrementalChange = $change;
        if (incrementalChange == null) {
            return this.Password;
        }
        return (String) incrementalChange.access$dispatch("getPassword.()Ljava/lang/String;", new Object[]{this});
    }

    public void setName(String name) {
        IncrementalChange incrementalChange = $change;
        if (incrementalChange != null) {
            incrementalChange.access$dispatch("setName.(Ljava/lang/String;)V", new Object[]{this, name});
            return;
        }
        this.Name = name;
    }

    public void setPassword(String password) {
        IncrementalChange incrementalChange = $change;
        if (incrementalChange != null) {
            incrementalChange.access$dispatch("setPassword.(Ljava/lang/String;)V", new Object[]{this, password});
            return;
        }
        this.Password = password;
    }

    public User() {
        IncrementalChange incrementalChange = $change;
        if (incrementalChange != null) {
            Object[] objArr = (Object[]) incrementalChange.access$dispatch("init$args.([Lcom/example/jijin/qrlogin/User;[Ljava/lang/Object;)Ljava/lang/Object;", new Object[]{null, new Object[0]});
            Object[] objArr2 = (Object[]) objArr[0];
            this(objArr, null);
            objArr2[0] = this;
            incrementalChange.access$dispatch("init$body.(Lcom/example/jijin/qrlogin/User;[Ljava/lang/Object;)V", objArr2);
        }
    }

    public User(String name, String password) {
        IncrementalChange incrementalChange = $change;
        if (incrementalChange != null) {
            Object[] objArr = (Object[]) incrementalChange.access$dispatch("init$args.([Lcom/example/jijin/qrlogin/User;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", new Object[]{null, name, password, new Object[0]});
            Object[] objArr2 = (Object[]) objArr[0];
            this(objArr, null);
            objArr2[0] = this;
            incrementalChange.access$dispatch("init$body.(Lcom/example/jijin/qrlogin/User;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V", objArr2);
            return;
        }
        this.Name = name;
        this.Password = password;
    }
}
