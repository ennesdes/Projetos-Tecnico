from django.urls import path
from .views import IndexView, AtendimentoView, ClientesView, FuncionariosView, ProdutosView, ServicosView,\
    ServicoProdutoView
from .views import AtendimentoAddView, ClienteAddView, FuncionarioAddView, ProdutoAddView, ServicoAddView,\
    ServicoProdutoAddView
from .views import AtendimentoUpDateView, ClienteUpDateView, FuncionarioUpDateView, ProdutoUpDateView,\
    ServicoUpDateView, ServicoProdutoUpDateView
from .views import AtendimentoDeleteView, ClienteDeleteView, FuncionarioDeleteView, ProdutoDeleteView,\
    ServicoDeleteView, ServicoProdutoDeleteView

urlpatterns = [
    path('', IndexView.as_view(), name='index'),
    path('atendimentos', AtendimentoView.as_view(), name='atendimentos'),
    path('atendimento/adicionar/', AtendimentoAddView.as_view(), name='atendimento_adicionar'),
    path('<int:pk>/atendimento/editar/', AtendimentoUpDateView.as_view(), name='atendimento_editar'),
    path('<int:pk>/atendimento/apagar/', AtendimentoDeleteView.as_view(), name='atendimento_apagar'),
    path('clientes', ClientesView.as_view(), name='clientes'),
    path('cliente/adicionar/', ClienteAddView.as_view(), name='cliente_adicionar'),
    path('<int:pk>/cliente/editar/', ClienteUpDateView.as_view(), name='cliente_editar'),
    path('<int:pk>/cliente/apagar/', ClienteDeleteView.as_view(), name='cliente_apagar'),
    path('funcionarios', FuncionariosView.as_view(), name='funcionarios'),
    path('funcionario/adicionar/', FuncionarioAddView.as_view(), name='funcionario_adicionar'),
    path('<int:pk>/funcionario/editar/', FuncionarioUpDateView.as_view(), name='funcionario_editar'),
    path('<int:pk>/funcionario/apagar/', FuncionarioDeleteView.as_view(), name='funcionario_apagar'),
    path('produtos', ProdutosView.as_view(), name='produtos'),
    path('produto/adicionar/', ProdutoAddView.as_view(), name='produto_adicionar'),
    path('<int:pk>/produto/editar/', ProdutoUpDateView.as_view(), name='produto_editar'),
    path('<int:pk>/produto/apagar/', ProdutoDeleteView.as_view(), name='produto_apagar'),
    path('servicos', ServicosView.as_view(), name='servicos'),
    path('servico/adicionar/', ServicoAddView.as_view(), name='servico_adicionar'),
    path('<int:pk>/servico/editar/', ServicoUpDateView.as_view(), name='servico_editar'),
    path('<int:pk>/servico/apagar/', ServicoDeleteView.as_view(), name='servico_apagar'),
    path('servicoProduto', ServicoProdutoView.as_view(), name='servicoProduto'),
    path('servicoProduto/adicionar/', ServicoProdutoAddView.as_view(), name='servicoProduto_adicionar'),
    path('<int:pk>/servicoProduto/editar/', ServicoProdutoUpDateView.as_view(), name='servicoProduto_editar'),
    path('<int:pk>/servicoProduto/apagar/', ServicoProdutoDeleteView.as_view(), name='servicoProduto_apagar'),
]
