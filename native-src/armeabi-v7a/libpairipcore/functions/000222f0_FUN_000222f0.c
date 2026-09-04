/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_000222f0
 * Address  : 000222f0
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


undefined8 FUN_000222f0(undefined4 *param_1,int *param_2)

{
  ushort uVar1;
  char *pcVar2;
  undefined4 uVar3;
  int *piVar4;
  uint unaff_r5;
  int unaff_r6;
  int iVar5;
  
  iVar5 = DAT_00022368 + 0x22312;
  while( true ) {
    pcVar2 = (char *)*param_1;
    if ((pcVar2 == (char *)param_1[1]) || (*pcVar2 != 'B')) goto LAB_0002235e;
    *param_1 = pcVar2 + 1;
    FUN_000224c2(&stack0xffffffd4,param_1);
    if (&stack0xfffffff8 == (undefined1 *)0x0) break;
    uVar3 = FUN_0001dbc0(param_1 + 0x66,0x14);
    uVar1 = *(ushort *)((int)param_2 + 5);
    unaff_r5 = (uVar1 & 0xfff) >> 10;
    piVar4 = (int *)FUN_0001e9c0(uVar3,9,(byte)uVar1 >> 6,(uVar1 & 0x3ff) >> 8);
    piVar4[2] = (int)param_2;
    piVar4[3] = unaff_r6;
    piVar4[4] = (int)&stack0xfffffff8;
    *piVar4 = iVar5;
    param_2 = piVar4;
  }
  param_2 = (int *)0x0;
LAB_0002235e:
  return CONCAT44(unaff_r5,param_2);
}


