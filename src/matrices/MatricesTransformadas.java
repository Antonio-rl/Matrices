package matrices;

import matrices.utils.ImprimirArreglos;


/**
 *
 * @author ING. DE SISTEMAS
 */
public class MatricesTransformadas{

ImprimirArreglos ia=new ImprimirArreglos();

public int[][] transformada01(int dimen, int numInit){
    int[][] matriz=new int[dimen][dimen];
    int item=0;
    for(int fila=0; fila<dimen;fila++){
        for(int columna=0; columna<dimen;columna++){
            if(columna<dimen-fila){
            item=numInit+(fila+columna)*(fila+columna+1)/2 + fila;
            matriz[fila][columna]=item;                
            }
        }
    }
    return matriz;
}

public int[][] transformada02(int dimen, int numInit){
    int[][] matriz=new int[dimen][dimen];
    int item=0;
    for(int fila=0; fila<dimen;fila++){
        for(int columna=0; columna<dimen;columna++){
            if(columna<dimen-fila){
                
            item=numInit+(fila+columna)*(fila+columna+1)/2 + columna;
            matriz[fila][columna]=item;                
            }
        }
    }
    return matriz;
}

public int[][] transformada03(int dimen, int numInit){
    int[][] matriz=new int[dimen][dimen];
    int item=0;
    for(int fila=0; fila<dimen;fila++){
        for(int columna=0; columna<dimen;columna++){
            if(columna<dimen-fila){                            
                if((fila+columna)%2==0){
                item=numInit+(fila+columna)*(fila+columna+1)/2 + columna; 
                matriz[fila][columna]=item;
                }else{
                item=numInit+(fila+columna)*(fila+columna+1)/2 + fila; 
                matriz[fila][columna]=item;
                }            
            }
        }
    }
    return matriz;
}

public int[][] transformada04(int dimen, int numInit){
    int[][] matriz=new int[dimen][dimen];
    int item=0;
    for(int fila=0; fila<dimen;fila++){
        for(int columna=0; columna<dimen;columna++){
            if(columna<dimen-fila){                            
                                
                if((fila+columna)%2==0){
                item=numInit+(fila+columna)*(fila+columna+1)/2 + fila; 
                matriz[fila][columna]=item;
                }
                else{
                item=numInit+(fila+columna)*(fila+columna+1)/2 + columna; 
                matriz[fila][columna]=item;
                }                 
                
            }
        }
    }
    return matriz;
}


public int[][] transformada05(int dimen, int numInit){
    int[][] matriz=new int[dimen][dimen];
    int contador=0;
    for(int fila=0; fila<matriz.length;fila++){
        for(int columna=matriz[0].length-1; columna>=0;columna--){
            if(contador<=fila){                            
                matriz[fila][columna]= numInit;                                                                
                numInit++;
                contador++;
            }else{
               matriz[fila][columna]=-0; 
            }
        }
        contador=0;
    }
    return matriz;
}


public int[][] transformada06(int dimen, int numInit){
    int[][] matriz=new int[dimen][dimen];
    int contador=0;
    for(int fila=0; fila<matriz.length;fila++){
        for(int columna=0; columna<=matriz[0].length-1;columna++){
            if(contador<=fila){                            
                matriz[fila][columna]= numInit;                                                                
                numInit++;
                contador++;
            }else{
               matriz[fila][columna]=0; 
            }
        }
        contador=0;
    }
    return matriz;
}


public int[][] transformada07(int dimen, int numInit){
    int[][] matriz=new int[dimen][dimen];
    int contador=matriz.length-1;
    for(int fila=0; fila<matriz.length;fila++){
        for(int columna=0; columna<=matriz[0].length-1;columna++){
            if(contador>=fila){                            
                matriz[fila][columna]= numInit;                                                                
                numInit++;
                contador--;
            }else{
               matriz[fila][columna]=0; 
            }
        }
        contador=matriz.length-1;
    }
    return matriz;
}


public int[][] transformada08(int dimen, int numInit){
    int[][] matriz=new int[dimen][dimen];
    int contador=matriz.length-1;
    for(int fila=0; fila<matriz.length;fila++){ 
        for(int columna=0; columna<=matriz[0].length-1;columna++){
            if(columna>=fila){                            
                matriz[fila][columna]= numInit;                                                                
                numInit++;
                contador++;
            }else{
               matriz[fila][columna]=0; 
            }
        }
        contador=matriz.length-1;
    }
    return matriz;
}


public int[][] transformada09(int dimen, int numInit){
    int[][] matriz=new int[dimen][dimen];
    int contador=matriz.length-1;
    for(int fila=0; fila<matriz.length;fila++){
        for(int columna=0; columna<=matriz.length-1;columna++){
            if(contador<=fila){                            
                matriz[fila][columna]= numInit;                                                                
                numInit++;
                
            }else{
               matriz[fila][columna]=0;
               contador--;
            }
        }
        contador=matriz.length-1;
    }
    return matriz;
}


public int[][] transformada10(int dimen, int numInit){
    int[][] matriz=new int[dimen][dimen];
    int contador=matriz.length-1;
    for(int fila=0; fila<matriz.length;fila++){
        for(int columna=matriz.length-1; columna>=0;columna--){
            if(contador<=fila){                            
                matriz[fila][columna]= numInit;                                                                
                numInit++;
                
            }else{
               matriz[fila][columna]=0;
               contador--;
            }
        }
        contador=matriz.length-1;
    }
    return matriz;
}


public int[][] transformada11(int dimen, int numInit){
    int[][] matriz=new int[dimen][dimen];
    int contador=0;
    for(int fila=0; fila<=matriz.length-1;fila++){
        for(int columna=matriz.length-1; columna>=0;columna--){
            if(contador>=fila){                            
                matriz[fila][columna]= numInit;                                                                
                numInit++;
                contador++;
            }else{
               matriz[fila][columna]=0; 
               contador++;
            }
        }
        contador=0;
    }
    return matriz;
}

public int[][] transformada12(int dimen, int numInit){
    int[][] matriz=new int[dimen][dimen];
    int contador=matriz.length-1;
    for(int fila=0; fila<matriz.length;fila++){
        for(int columna=matriz[0].length-1; columna>=0;columna--){ 
            if(contador>=fila){                            
                matriz[fila][columna]= numInit;                                                                
                numInit++;
                contador--;
            }else{
               matriz[fila][columna]=0; 
            }
        }
        contador=matriz.length-1;
    }
    return matriz;
}

public int[][] transformada13(int dimen, int numInit){
    int[][] matriz=new int[dimen][dimen];
    int contador=matriz.length-1;
    for(int columna=0; columna<=matriz.length-1;columna++){
        for(int fila=0; fila<=matriz.length-1;fila++){
            if(contador>=columna){                            
                matriz[fila][columna]= numInit;                                                                
                numInit++;
                contador--;
            }else{
               matriz[fila][columna]=0; 
            }
        }
        contador=matriz.length-1;
    }
    return matriz;
}
public int[][] transformada14(int dimen, int numInit){
    int[][] matriz=new int[dimen][dimen];
    int contador=0;
    for(int fila=0; fila<matriz.length;fila++){
        for(int columna=0; columna<=matriz[0].length-1;columna++){
            if(contador<=fila){                            
                matriz[columna][fila]= numInit;                                                                
                numInit++;
                contador++;
            }else{
               matriz[fila][columna]=0; 
            }
        }
        contador=0;
    }
    return matriz;
}

public int[][] transformada15(int dimen, int numInit){
    int[][] matriz=new int[dimen][dimen];
    int contador=matriz.length-1;
    for(int columna=0; columna<=matriz.length-1;columna++){
        for(int fila=matriz.length-1; fila>=0;fila--){
            if(contador>=columna){                            
                matriz[fila][columna]= numInit;                                                                
                numInit++;
                contador--;
            }else{
               matriz[fila][columna]=0; 
            }
        }
        contador=matriz.length-1;
    }
    return matriz;
}

public int[][] transformada16(int dimen, int numInit){
    int[][] matriz=new int[dimen][dimen];
    int contador=0;
    for(int fila=0; fila<matriz.length;fila++){
        for(int columna=matriz.length-1; columna>=0;columna--){
            if(contador<=fila){                            
                matriz[columna][fila]= numInit;                                                                
                numInit++;
                contador++;
            }else{
               matriz[fila][columna]=0; 
            }
        }
        contador=0;
    }
    return matriz;
}

public int[][] transformada17(int dimen, int numInit){
    int[][] matriz=new int[dimen][dimen];
    int contador=matriz.length-1;
    for(int columna=matriz.length-1; columna>=0;columna--){
        for(int fila=0; fila<=matriz.length-1;fila++){
            if(fila<=columna){                            
                matriz[fila][columna]= numInit;                                                                
                numInit++;
                contador--;
            }else{
               matriz[fila][columna]=0;
               contador--;
            }
        }
        contador=matriz.length-1;
    }
    return matriz;
}



public int[][] transformada23(int dimen, int numInit){
    int[][] matriz=new int[dimen][dimen];
    int fila=0;
    for(int columna=matriz[0].length-1; columna>=0;columna--){
        if(fila!=5){
            for(fila=0; fila<matriz.length;fila++){
                matriz[fila][columna]=numInit;
                numInit++;
            }                        
        }else{
            for(fila=matriz.length-1; fila>=0;fila--){
                matriz[fila][columna]=numInit;
                numInit++;
            }                      
        }        
    }
    return matriz;
}


public int[][] transformada24(int dimen, int numInit){
    int[][] matriz=new int[dimen][dimen];
    int fila=0;
    for(int columna=matriz[0].length-1; columna>=0;columna--){
        if(fila!=-1){
            for(fila=matriz.length-1; fila>=0;fila--){
                matriz[fila][columna]=numInit;
                numInit++;
            }
        }else{
            for(fila=0; fila<matriz.length;fila++){
                matriz[fila][columna]=numInit;
                numInit++;
            }            
        }        
    }
    return matriz;
}


public int[][] transformada28(int dimen, int numInit){
    int[][] matriz=new int[dimen][dimen];
    int columna=0;
    for(int fila=matriz[0].length-1; fila>=0;fila--){
        if(columna!=matriz.length){
            for(columna=0; columna<matriz.length;columna++){
                matriz[fila][columna]=numInit;
                numInit++;
            }
        }else{
            for(columna=matriz.length-1; columna>=0;columna--){
                matriz[fila][columna]=numInit;
                numInit++;
            }            
        }        
    }
    return matriz;
}


public int[][] transformada29(int dimen, int numInit){
    int[][] matriz=new int[dimen][dimen];
    for(int v=0; v<dimen/2; v++){
        for(int ls=v;ls<dimen-1-v; ls++){
            matriz[v][ls]=numInit;
            numInit++;            
        }
        for(int ld=v;ld<dimen-1-v; ld++){
            matriz[ld][dimen-1-v]=numInit;
            numInit++;            
        }        
        for(int li=dimen-1-v;li>v; li--){
            matriz[dimen-1-v][li]=numInit;
            numInit++;            
        }  
        for(int liz=dimen-1-v;liz>v; liz--){
            matriz[liz][v]=numInit;
            numInit++;            
        }              
    }
    if(dimen%2!=0){
        matriz[dimen/2][dimen/2]=numInit;
    }

    return matriz;
}


public int[][] transformada33(int dimen, int numInit){
    int[][] matriz=new int[dimen][dimen];
    for(int v=0; v<dimen/2; v++){
        for(int ls=dimen-v-1;ls>v; ls--){
            matriz[v][ls]=numInit;
            numInit++;            
        }
        for(int ld=v;ld<dimen-1-v; ld++){
            matriz[ld][v]=numInit;
            numInit++;            
        }        
        for(int li=v;li<dimen-1-v; li++){ 
            matriz[dimen-1-v][li]=numInit;
            numInit++;            
        }  
        for(int liz=dimen-1-v;liz>v; liz--){
            matriz[liz][dimen-v-1]=numInit;
            numInit++;            
        }              
    }
    if(dimen%2!=0){
        matriz[dimen/2][dimen/2]=numInit;
    }

    return matriz;
}


public int[][] transformada35(int dimen, int numInit){
    int[][] matriz=new int[dimen][dimen];
    int x, x1, x2, y, y1;
    for(x=matriz.length-1; x>=matriz.length/2; x--){
        for(y=(dimen-1)-x;y<=x;y++){
            matriz[x][y]=numInit;
            numInit++;
        }
        for(x1=y-2;x1>=(dimen-1)-x;x1--){
            matriz[x1][x]=numInit;
            numInit++;
        }   
        for(y1=y-2;y1>=(dimen-1)-x;y1--){
            matriz[x1+1][y1]=numInit;
            numInit++;
        }   
        for(x2=y1+2;x2<y-1;x2++){
            matriz[x2][y1+1]=numInit;
            numInit++;
        }                    
    }

    return matriz;
}






public static void main(String[] args) {
   MatricesTransformadas mt=new MatricesTransformadas(); 
   mt.ia.imprimirMatriz(mt.transformada33(5, 0));
}

    
}