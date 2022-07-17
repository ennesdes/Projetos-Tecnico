from django.db import models
from stdimage import StdImageField


class Cliente(models.Model):
    nome = models.CharField('Nome', max_length=35)
    endereco = models.CharField('Endereço', max_length=100)
    telefone = models.CharField('Telefone', max_length=15)
    email = models.CharField('E-mail', max_length=100)
    foto = StdImageField('Foto', upload_to='clientes', variations={'thumb': {'width': 100, 'height': 100, 'crop': True}},
                         blank=True, null=True)

    class Meta:
        verbose_name = 'Cliente'
        verbose_name_plural = 'Clientes'
        ordering = ['nome']

    def __str__(self):
        return self.nome


class Funcionario(models.Model):
    nome = models.CharField('Nome', max_length=35)
    telefone = models.CharField('Telefone', max_length=15)
    email = models.CharField('E-mail', max_length=100)
    funcao = models.CharField('Função', max_length=50)
    data_admissao = models.DateField('Data de admissão', null=True, blank=True)
    foto = StdImageField('Foto', upload_to='funcionarios', variations={'thumb': {'width': 100, 'height': 100, 'crop': True}},
                         blank=True, null=True)

    class Meta:
        verbose_name = 'Funcionário'
        verbose_name_plural = 'Funcionários'
        ordering = ['nome']

    def __str__(self):
        return self.nome


class Produto(models.Model):
    nome = models.CharField('Nome', max_length=35)
    preco = models.CharField('Preço', max_length=10)
    fornecedor = models.CharField('Fornecerdo', max_length=50)
    quantidade = models.IntegerField('Quantidade')

    class Meta:
        verbose_name = 'Produto'
        verbose_name_plural = 'Produtos'
        ordering = ['nome']

    def __str__(self):
        return self.nome


class Servico(models.Model):
    nome = models.CharField('Nome', max_length=35)
    descricao = models.CharField('Descrição', max_length=100)
    preco = models.CharField('Preço', max_length=10)

    class Meta:
        verbose_name = 'Serviço'
        verbose_name_plural = 'Serviços'
        ordering = ['nome']

    def __str__(self):
        return self.nome


SITUACAO_CHOICES = {
    ('agendado', 'AGENDADO'),
    ('realizado', 'REALIZADO'),
    ('cancelado', 'CANCELADO'),
}


class Atendimento(models.Model):
    cliente = models.ForeignKey('agendamento.Cliente', verbose_name='Cliente', on_delete=models.CASCADE)
    funcionario = models.ForeignKey('agendamento.Funcionario', verbose_name='Funcionário', on_delete=models.CASCADE)
    data_consulta = models.DateField('Data da consulta', null=True, blank=True)
    hora_consulta = models.TimeField('Hora da consulta', null=True, blank=True)
    servico = models.ForeignKey('agendamento.Servico', verbose_name='Serviço', on_delete=models.CASCADE)
    situacao = models.CharField('Situação', max_length=9, choices=SITUACAO_CHOICES, default='agendado')
    observacao = models.CharField('Observação', max_length=100)

    class Meta:
        verbose_name = 'Consulta'
        verbose_name_plural = 'Consultas'
        ordering = ['data_consulta']

    def __str__(self):
        return f'{self.cliente}'


class ServicoProduto(models.Model):
    servico = models.ForeignKey('agendamento.Servico', verbose_name='Servico', on_delete=models.CASCADE)
    produto = models.ForeignKey('agendamento.Produto', verbose_name='Produto', on_delete=models.CASCADE)
    quantidade = models.IntegerField('Quantidade de produtos')

    def __str__(self):
        return f'{self.servico} - {self.produto}'