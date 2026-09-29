from django.db import models

class Producto(models.Model):
    nombre=models.CharField(max_length=100)
    precio=models.DecimalField(max_digits=10,decimal_places=2)
    stock=models.IntegerField()
    def __str__(self):
        return self.nombre

class KardexMovimientosProducto(models.Model):
    TIPOS=[
        ('ENTRADA','Entrada'),
        ('SALIDA','Salida'),
        ('AJUSTE','Ajuste')
           ]
    producto=models.ForeignKey(Producto,on_delete=models.CASCADE,related_name='movimientos')
    tipo_movimiento=models.CharField(max_length=10,choices=TIPOS)
    cantidad=models.IntegerField
    fecha=models.DateTimeField(auto_now_add=True)
    observacion=models.CharField(max_length=200,blank=True,null=True)

    def __str__(self):
        return f"{self.tipo_movimiento}-{self.producto.nombre}-{self.cantidad}"