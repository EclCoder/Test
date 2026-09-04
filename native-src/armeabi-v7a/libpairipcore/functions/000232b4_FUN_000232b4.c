/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_000232b4
 * Address  : 000232b4
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


int * FUN_000232b4(int param_1)

{
  bool bVar1;
  int iVar2;
  int iVar3;
  int *piVar4;
  int *piVar5;
  
  iVar2 = FUN_0001bec0(param_1,DAT_0002335c + 0x232c6,2);
  if (iVar2 == 0) {
    iVar2 = FUN_0001bec0(param_1,DAT_00023364 + 0x232e0,2);
    if (iVar2 == 0) {
      iVar2 = FUN_0001bec0(param_1,DAT_0002336c + 0x232fa,2);
      if (iVar2 == 0) {
        iVar3 = 0;
        bVar1 = true;
        iVar2 = 0;
        goto LAB_0002330a;
      }
      iVar2 = 4;
      iVar3 = DAT_00023370 + 0x2330a;
    }
    else {
      iVar2 = 5;
      iVar3 = DAT_00023368 + 0x232f0;
    }
  }
  else {
    iVar2 = 6;
    iVar3 = DAT_00023360 + 0x232d6;
  }
  bVar1 = false;
LAB_0002330a:
  piVar4 = (int *)FUN_0001d34c(param_1,0);
  if ((!bVar1) && (piVar4 != (int *)0x0)) {
    piVar5 = (int *)FUN_0001dbc0(param_1 + 0x198,0x14);
    piVar5[2] = iVar3;
    piVar5[3] = iVar2;
    *(undefined1 *)(piVar5 + 1) = 6;
    piVar5[4] = (int)piVar4;
    *piVar5 = DAT_00023374 + 0x2333a;
    *(ushort *)((int)piVar5 + 5) = (*(ushort *)((int)piVar5 + 5) & 0xf000) + 0x540;
    piVar4 = piVar5;
  }
  return piVar4;
}


