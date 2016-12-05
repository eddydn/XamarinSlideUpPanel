package md546c45d491b042b167774b8aaeb1a2ac0;


public class SlidingUpPanelLayout_SavedState
	extends android.view.View.BaseSavedState
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_writeToParcel:(Landroid/os/Parcel;I)V:GetWriteToParcel_Landroid_os_Parcel_IHandler\n" +
			"n_InitializeCreator:()Lmd546c45d491b042b167774b8aaeb1a2ac0/SlidingUpPanelLayout_SavedState_SavedStateCreator;:__export__\n" +
			"";
		mono.android.Runtime.register ("Cheesebaron.SlidingUpPanel.SlidingUpPanelLayout+SavedState, Cheesebaron.SlidingUpPanel, Version=1.0.5.0, Culture=neutral, PublicKeyToken=null", SlidingUpPanelLayout_SavedState.class, __md_methods);
	}


	public SlidingUpPanelLayout_SavedState (android.os.Parcel p0) throws java.lang.Throwable
	{
		super (p0);
		if (getClass () == SlidingUpPanelLayout_SavedState.class)
			mono.android.TypeManager.Activate ("Cheesebaron.SlidingUpPanel.SlidingUpPanelLayout+SavedState, Cheesebaron.SlidingUpPanel, Version=1.0.5.0, Culture=neutral, PublicKeyToken=null", "Android.OS.Parcel, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}


	public SlidingUpPanelLayout_SavedState (android.os.Parcel p0, java.lang.ClassLoader p1) throws java.lang.Throwable
	{
		super (p0, p1);
		if (getClass () == SlidingUpPanelLayout_SavedState.class)
			mono.android.TypeManager.Activate ("Cheesebaron.SlidingUpPanel.SlidingUpPanelLayout+SavedState, Cheesebaron.SlidingUpPanel, Version=1.0.5.0, Culture=neutral, PublicKeyToken=null", "Android.OS.Parcel, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Java.Lang.ClassLoader, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0, p1 });
	}


	public SlidingUpPanelLayout_SavedState (android.os.Parcelable p0) throws java.lang.Throwable
	{
		super (p0);
		if (getClass () == SlidingUpPanelLayout_SavedState.class)
			mono.android.TypeManager.Activate ("Cheesebaron.SlidingUpPanel.SlidingUpPanelLayout+SavedState, Cheesebaron.SlidingUpPanel, Version=1.0.5.0, Culture=neutral, PublicKeyToken=null", "Android.OS.IParcelable, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}


	public static md546c45d491b042b167774b8aaeb1a2ac0.SlidingUpPanelLayout_SavedState_SavedStateCreator CREATOR = InitializeCreator ();


	public void writeToParcel (android.os.Parcel p0, int p1)
	{
		n_writeToParcel (p0, p1);
	}

	private native void n_writeToParcel (android.os.Parcel p0, int p1);

	public static md546c45d491b042b167774b8aaeb1a2ac0.SlidingUpPanelLayout_SavedState_SavedStateCreator InitializeCreator ()
	{
		return n_InitializeCreator ();
	}

	private static native md546c45d491b042b167774b8aaeb1a2ac0.SlidingUpPanelLayout_SavedState_SavedStateCreator n_InitializeCreator ();

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
