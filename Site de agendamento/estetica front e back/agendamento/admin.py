from django.contrib import admin
from django.utils.safestring import mark_safe

from .models import Cliente, Funcionario, Produto, Servico, Atendimento, ServicoProduto


@admin.register(Cliente)
class ClienteAdmin(admin.ModelAdmin):
    list_display = ('nome', 'endereco', 'telefone', 'email', 'foto')
    readonly_fields = ['fotografia']
    search_fields = ('nome',)

    def fotografia(self, obj):
        return mark_safe('<img src="{url}" width="{width}" height="{height}" />'.format(
            url=obj.foto.url,
            width=obj.foto.width,
            height=obj.foto.height,
        )
        )


@admin.register(Funcionario)
class FuncionarioAdmin(admin.ModelAdmin):
    list_display = ('nome', 'telefone', 'email', 'funcao', 'data_admissao', 'foto')
    readonly_fields = ['fotografia']
    search_fields = ('nome',)

    def fotografia(self, obj):
        return mark_safe('<img src="{url}" width="{width}" height="{height}" />'.format(
            url=obj.foto.url,
            width=obj.foto.width,
            height=obj.foto.height,
        )
        )


@admin.register(Produto)
class ProdutoAdmin(admin.ModelAdmin):
    list_display = ('nome', 'preco', 'fornecedor', 'quantidade')
    search_fields = ('nome',)


@admin.register(Servico)
class ServicoAdmin(admin.ModelAdmin):
    list_display = ('nome', 'descricao', 'preco')
    search_fields = ('nome', 'descricao')


@admin.register(Atendimento)
class AtendimentoAdmin(admin.ModelAdmin):
    list_display = ('cliente', 'funcionario', 'data_consulta', 'hora_consulta', 'servico', 'situacao', 'observacao')
    list_filter = ('situacao', 'data_consulta', 'hora_consulta')


@admin.register(ServicoProduto)
class ServicoProdutoAdmin(admin.ModelAdmin):
    list_display = ('servico', 'produto', 'quantidade')
    search_fields = ('servico',)
